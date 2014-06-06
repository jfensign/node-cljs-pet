(ns clients-rpas.core 
 (:require 
  [ring.adapter.jetty :as jetty] 
  [ring.middleware.resource :as resources]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  (println foo args))