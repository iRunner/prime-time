(ns prime-time.prime-test
  (:require [clojure.test :refer :all]
            [prime-time.prime :refer :all]))

(deftest prime?-test
  (testing "Testing prime? Base cases"
    (is (= (prime? 1) false))
    (is (= (prime? 2) true))
    (is (= (prime? 4) false))))

(deftest first-n-primes-test
  (testing "Testing first-n-primes Base cases"
    (is (= (first-n-primes 1) [2]))
    (is (= (first-n-primes 10) [2 3 5 7 11 13 17 19 23 29]))))
