(ns renjin-test.core
  (:import [javax.script ScriptEngineManager ScriptEngine]
           [java.io FileReader])
  )

(defn -main []
  (let [m (ScriptEngineManager.)
        e (.getEngineByName m "Renjin")]
    (when (not (nil? e))
      (.eval e (FileReader. "test.R")))))

(-main)
