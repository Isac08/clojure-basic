(ns app.variables.defn
  (:require [clojure.string :as cljStr]
            )
  )

; defn is used to create a function
; one fn can have more than one vector parameters [a, b, ...]
(defn greet [name]
  (str "hi, " name)
  )

(greet "isac")

; one fn can have more expression
; one fn only return the last expression
(defn callMe [name]
  (println "calling....")
  (str "hey, " name)
  )

(callMe "beibehhh")

; ---- multi-arity
; one fn can handle optional parameter
(defn sayHi
  ([] (sayHi "guest."))
  ([name] (str "Hi " name))
  ([name & others] (str "Hi " name " and "
                        (cljStr/join "," others)
                        )
   )
  )

(sayHi)
(sayHi "rebo" "isac" "ldef" "ayu")

; ---- variadic parameters
; variadic is kind of rest in JavaScript
; it takes the rest of a parameter as list/sequence
; symbol variadic parameters => &
;
; important !!
; - variadic must be used on the last of the parameters
(defn sum [& numbers]
  (let [total (reduce + numbers)]
    total
    )
  )

(sum 1 2 3 4)

; --- apply
; apply is like spread operator on JavaScript
; apply is used to call a fn that has collection (list/vector)
; form:
; (apply fn [...args])
(apply max [1, 2, 3, 4, 5])

(apply + [2, 5, 21])

(def nums [1,2,3,4,5,6,7,8,9,10])

(apply sum nums)
; ---- anonymous function
; start by using #
#(% 2) [2, 3, 1]