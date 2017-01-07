(defproject genetic-algorithms "0.1.0-SNAPSHOT"
  :description "Clojure port of \"Machine Learning: Introduction to Genetic Algorithms\""
  :url "https://github.com/mdgart/clojure-genetic-algorithms"
  :license {:name "unlicense"
            :url "http://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot genetic-algorithms.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
