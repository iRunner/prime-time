(ns prime-time.prime)

(def certainty 5)

(defn prime? [n]
  (.isProbablePrime (BigInteger/valueOf n) certainty))

(defn first-n-primes [n]
  (take n (filter prime? (iterate inc 1))))
