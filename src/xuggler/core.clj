(ns xuggler.core)
(import [com.xuggle.mediatool
        ToolFactory IMediaReader IMediaWriter ])

(defn- add-debug [writer]
  (.addListener writer
    (ToolFactory/makeDebugListener )))

(defn convert [from to & options]
    (let [reader (ToolFactory/makeReader from)
          writer (ToolFactory/makeWriter to, reader)
          option-map (apply merge (cons {} options))]

          (.addListener reader writer)
          (if (option-map :debug) (add-debug writer))
          (while (= nil (.readPacket reader)))))

(defn -main [& args]
    (let [argsv (vec args)]
        (convert (argsv 0) (argsv 1) )))
