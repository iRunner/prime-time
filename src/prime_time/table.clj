(ns prime-time.table
  (:require [prime-time.prime :as prime]))

(defn fill-row [front arr]
  (let [multi (map #(* front %) arr)
        multi-map (into {0 front} (zipmap arr multi))]
    (into (sorted-map) multi-map)))


(defn create-table [n]
  (let [n-prime (prime/first-n-primes n)]
    (map #(fill-row % n-prime) n-prime)))
