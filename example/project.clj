(defproject example "1.0.0-SNAPSHOT"
  :description "A simple WebGL example"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]
                 [hiccup "1.0.0"]]
  :dev-dependencies [[lein-ring "0.7.0"]]
  :ring {:handler example.routes/app})
