(ns prime-time.prime-test
  (:require [clojure.test :refer :all]
            [prime-time.prime :refer :all]))

(deftest prime?-test
  (testing "Testing prime? Base cases"
    (is (= (prime? 1) false))
    (is (= (prime? 2) true))
    (is (= (prime? 4) false))))
