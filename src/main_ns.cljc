(ns main-ns
  #?(:cljs (:require-macros [main-ns :refer [my-macro]]))
  (:require [required-ns :as r]))

(defn ^:private my-fun [x]
  (inc x))

#?(:clj
   (defmacro my-macro []
     `(my-fun (r/foo))))

(comment
  (my-macro))
