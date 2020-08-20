(ns main-ns
  #?(:cljs (:require-macros [main-ns :refer [my-macro]]))
  (:require [required-ns :as r]))

(comment
  ;; A workaround is to add the following to the `ns` form, after `main-ns`:
  {:clj-kondo/config '{:linters {:unused-private-var {:exclude [main-ns/my-fun]}
                                 :unused-namespace {:exclude [required-ns]}}}}
  ;; (Thanks to @borkdude at
  ;; https://clojurians.slack.com/archives/CHY97NXE2/p1597941250010400)
  )

(defn ^:private my-fun [x]
  (inc x))

#?(:clj
   (defmacro my-macro []
     `(my-fun (r/foo))))

(comment
  (my-macro))
