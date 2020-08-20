# nomis-clj-kondo-cljc-macros-2

Clojure (CLJC) code for which clj-kondo v2020.07.29 shows some erroneous warnings.

The ns `main-ns`, defined in a .cljc file, contains a macro `my-macro` that expands into code that calls two functions, one of which is in the same ns (`my-fun`) and one that is named using a namespace alias (`r/foo`).

clj-kondo gives two erroneous warnings:

- Unused private var main-ns/my-fun (clj-kondo-cljc)
- namespace required-ns is required but never used (clj-kondo-cljc)
