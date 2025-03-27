(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= true true)

  "To understand reality, we must compare our expectations against reality"
  (= 2 (+ 1 1))

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 5))

  "Some things may appear different, but be the same"
  (= true (= 2 2/1))

  "You cannot generally float to heavens of integers"
  (= false (= 2 2.0))

  "But a looser equality is also possible"
  (= true (== 2.0 2))

  "Something is not equal to nothing"
  (= true (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!"
  (= false (= "hello" :hello 'hello))

  "Make a keyword with your keyboard"
  (= :hello (keyword "hello"))

  "Symbolism is all around us"
  (= 'hello (symbol :hello))

  "What could be equivalent to nothing?"
  (=  nil)

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank "string"))



;; playground
(defn product-list [coll]
  (if (empty? coll)
    1
    (reduce * 1 coll)))

;;(println (product-list [10 20 30])) ;;=> 6000

(defn max-list [coll]
  (if (empty? coll)
    nil
    (reduce max coll)))

;; (println (max-list [10 20 30])) ;;=> 30


(defn count-occurrences [coll a]
  (count (filter #(= % a) coll)))

;; (println (count-occurrences [10 20 30 10 10] 10)) ;;=> 3

(defn remove-occurrences [coll a]
  (filter #(not= % a) coll))

;; (println (remove-occurrences [10 20 30 10 10] 10)) ;;=> (20 30)

(defn group-frequencies [coll]
  (map #()))

;; (group-frequencies [1 2 2 3 3 3])
;; => {1 1, 2 2, 3 3}

;; (group-frequencies [:a :b :a :a :c])
;; => {:a 3, :b 1, :c 1}

;; (group-frequencies [])
;; => {}