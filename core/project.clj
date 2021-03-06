(defproject tesser.core "0.1.0-SNAPSHOT"
  :description "Composable concurrent folds for Clojure."
  :url "http://github.com/aphyr/tesser"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[interval-metrics "1.0.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]
                                  [org.clojars.achim/multiset "0.1.0-SNAPSHOT"]
                                  [criterium "0.4.3"]
                                  [org.clojure/test.check "0.5.9"]]}})
