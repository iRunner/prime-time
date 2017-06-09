(ns prime-time.table
  (:require [prime-time.prime :as prime]))

(defn fill-row 
  "input: 
    front: first coloumn in row/number to multiply array by
    arr:  rest of row 
  return: a row in the table in a form of a map (keys are prime numbers)
          {0 front} is the first column
  * did this because wanted to utilize clojure.pprint/print-table :D
  "
  [front arr]
  (let [multi (map #(* front %) arr)
        multi-map (into {0 front} (zipmap arr multi))]
    (into (sorted-map) multi-map)))


(defn create-table
  "
    input: table size (n*n)
    output: array of rows that are beautifully printed by 
    clojure.pprint/print-table
  " 
  [n]
  (let [n-prime (prime/first-n-primes n)]
    (map #(fill-row % n-prime) n-prime)))
