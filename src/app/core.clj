; --- namespace ---
; ns is short of namespace, it is used to define a namespace for the code in the file.
; ns is mapped based on the directory (e,g: app.core => means app/core)
; ns is used for some reason, such as :
; - organizing code into logical modules (identity)
; - preventing naming collisions between different libraries (isolation)
; - managing dependencies via :require and :import
;
; one file = one ns => app.user => app.user.services | app.user.validation

(ns app.core
  (:require
    [clojure.string :as str]
    [app.math :as math]
    ))

(defn greet [name]
  (str/upper-case (str "Hello " name)))

(println (greet "World!"))

(println (math/add 20 12))