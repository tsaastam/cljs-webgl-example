(ns example.macros)

(defmacro inc! [place-form amount-form]
  `(set! ~place-form (+ ~place-form ~amount-form)))

