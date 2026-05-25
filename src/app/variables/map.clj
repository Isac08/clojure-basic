(ns app.variables.map)
;| Function                  | used for            |
;| ------------------------- | ------------------- |
;| `(:key m)`                | ambil value         |
;| `(get m :key)`            | ambil value         |
;| `(assoc m :k v)`          | add/update          |
;| `(dissoc m :k)`           | remove              |
;| `(update m :k f)`         | update via function |
;| `(get-in m [:a :b])`      | nested get          |
;| `(assoc-in m [:a :b] v)`  | nested set          |
;| `(update-in m [:a :b] f)` | nested update       |
;| `(merge a b)`             | gabung map          |

; ---- Map
; is key-value based data structure
; key is written like this :key
; key is also a function to call the value
(def user {:name "isac" :age 27 :role "Dev" :email nil})

(:name user)

; using fn called get
(get user :name)
; equal to
(user :role)

; add default value
(user :email "no-email")

; get multiple data of Map
(select-keys user [:name :age])

; get multiple data of Map but select only the values
(map user [:name :role])

; --- assoc
; is used to add or update key
; assoc is not modified the original Map (immutable)
(assoc user :status "active")

; to save the updated value, create new variable
(def updated-user (assoc user :email "isac@gmail.com"))

(println updated-user)

; --- dissoc
; is used to remove the key
(dissoc user :email)

; to save the updated value, create new variable
(def deleted-user (dissoc user :email "isac@gmail.com"))

(println deleted-user)

; --- update
; is a function to update the Map using function
(defn happyBirthday [age]
  (+ age 1))

(update user :age happyBirthday)

; next(nested-map)