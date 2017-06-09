(ns prime-time.main
  (:require [prime-time.prime :as prime]
            [prime-time.table :as table])
  (:use clojure.pprint)
  (:gen-class))


(defn -main [& args]
  (println "Prime Table of 10")
  (print-table (table/create-table 10)))
