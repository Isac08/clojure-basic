(ns app.map)

; ---- Map
; is key-value based data structure
; key is written like this :key
; key is also a function to call the value
(def user {:name "isac" :age 27})

(:name user)
; or
; using fn called get
(get user :name)