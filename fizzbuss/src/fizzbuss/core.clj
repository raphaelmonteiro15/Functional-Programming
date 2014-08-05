(ns fizzbuss.core
  (:gen-class))


(defn -main
  []
  (defn fizz? [number]
    (zero? (rem number 3)))

(defn buzz? [number]
    (zero? (rem number 5)))

(defn fizz-buzz? [number]
    (and (fizz? number) (buzz? number)))

(defn fizz-buzz [number]
    (match number)
    (if (fizz-buzz? number) "fizzbuzz"
    (if (fizz? number) "fizz" 
    (if (buzz? number) "buzz" number))))

(defn run-fizz-buzz []
    (map fizz-buzz (range 1 20)))

(println (run-fizz-buzz)))

