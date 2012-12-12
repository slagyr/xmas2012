(defproject xmas "1.0"
  :description "8th Lights 2012 Christmas Party game"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [speclj "2.4.0"]]
  :profiles {:dev {:dependencies [[speclj "2.4.0"]]}}
  :plugins [[speclj "2.4.0"]]
  :test-paths ["spec"])
