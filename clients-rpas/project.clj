(defproject clients-rpas "0.1.0-SNAPSHOT"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2227"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :cljsbuild {
  	:builds {
  	  :main {
        :source-paths ["src/cljs"]
        :compiler{
       	  :output-to "target/nodejs"
       	  :warnings true
          :pretty-print true
     	  :target :nodejs
     	  :optimizations :simple}}}}

  :main clients-rpas.core)
