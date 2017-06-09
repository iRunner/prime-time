(ns prime-time.table-test
  (:require [clojure.test :refer :all]
            [prime-time.table :refer :all]))

(deftest fill-row-test
  (testing "Testing if fill row creates correct map"
    (is (= (fill-row 2 [1 2 3 4 5]) {0 2
                                     1 2
                                     2 4
                                     3 6
                                     4 8
                                     5 10}))))

(deftest create-table-test
  (testing "Create table creates a hashmap table"
    (is (= (create-table 2) [{0 2 2 4 3 6} {0 3 2 6 3 9}]))))
