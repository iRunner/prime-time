(ns prime-time.prime)

(def certainty 5)

(defn prime? 
  "
    input: integer
    output: true or false depending on if integer is prime

    problem: maynot work for integers greater than a large number
  "
  [n]
  (.isProbablePrime (BigInteger/valueOf n) certainty))

(defn first-n-primes 
  "
    input: integer
    output: array of n size of prime numbers starting with 2
  "
  [n]
  (take n (filter prime? (iterate inc 1))))
