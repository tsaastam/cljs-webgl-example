cljs-webgl-example
==================

An example of how to use WebGL from ClojureScript.

This code was originally written by Vishvajit Singh. Sources:

* http://www.meetup.com/Los-Angeles-Clojure-Users-Group/events/74501052/
* http://vishsingh.com/files/2012-08-cljstalk-demos.tar.gz

Some mild modifications were made by Taneli & David to make it work with
Leiningen 2.

How to compile & run
====================

    lein deps
    lein cljsbuild once
    lein ring server-headless 3000

Then browse to http://localhost:3000
