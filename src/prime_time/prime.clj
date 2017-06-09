(ns prime-time.prime)

(def certainty 5)

(defn prime? [n]
        (.isProbablePrime (BigInteger/valueOf n) certainty))

