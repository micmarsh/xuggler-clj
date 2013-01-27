(defproject xuggler "0.1.0"
    :description "A clojure wrapper of the Xuggler library, possibly illegal"
    :url "https://github.com/micmarsh/xuggler-clj"
    :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
    :main xuggler.core
    :repositories [["xuggle repo" "http://xuggle.googlecode.com/svn/trunk/repo/share/java/"]]
    :dependencies [[org.clojure/clojure "1.4.0"]
                 [xuggle/xuggle-xuggler "5.4"]])
