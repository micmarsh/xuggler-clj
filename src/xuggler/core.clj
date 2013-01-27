(ns xuggler.core)
(import [com.xuggle.mediatool
        ToolFactory IMediaReader IMediaWriter ])

(defn convert [from to options]
    (let [reader (ToolFactory/makeReader from)
          writer (ToolFactory/makeWriter to, reader)
          ;optional adding of debugging output to writer
          debug (fn [writer] (.addListener writer
            (ToolFactory/makeDebugListener )))]

          (.addListener reader writer)
          (if (options :debug) (debug writer))
          (while (= nil (.readPacket reader)))))

(defn -main [& args]
    (let [argsv (vec args)]
        (convert (argsv 0) (argsv 1) {:debug true})))
