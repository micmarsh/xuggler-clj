(ns xuggler.core)
(import [com.xuggle.mediatool ToolFactory IMediaReader IMediaWriter])

(defn convert [from to]
    (let [reader (ToolFactory/makeReader from)
          writer (ToolFactory/makeWriter to)]
          (.addListener reader writer)
          (while (= nil (.readPacket reader)))))

(defn -main [& args]
    (let [argsv (vec args)]
        (convert (argsv 0) (argsv 1))))
