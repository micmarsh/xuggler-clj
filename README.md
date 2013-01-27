# xuggler-clj

A Clojure wrapper for Xuggler (https://github.com/xuggle/xuggle-xuggler)

## Usage

Add to a project:
```clojure
[xuggler "0.1.0"]
```
Or use in the lein repl:
```clojure
(use 'xuggler.core)
```
## Syntax
```clojure
(ns your.namespace
    (:use [xuggler.core :only [convert]]))

(convert "input.flv" "output.mp4")
```

## License

Copyright © 2013 Michael Marsh

Distributed under the Eclipse Public License, the same as Clojure.

Also contains GPL code from Xuggler, so shit's all fucked up and probably illegal.

## Todo

Compile Xuggler yourself to make it LGPL (see above), then set up your own Maven repo.
