(ns app.variables.base)

; ----- def -----
; def is used to define global variable inside namespace
; always reload REPL after changing def value
(def x [10, 20, 30])

; let is used to define local variable inside a function
; it is declared by using vector bindings [name value, name value, ...]
(let [name "isac"]
  name)

; example vector bindings on fn
(defn callMe [name]
  (str "hi," name)
  )

(callMe "isac")