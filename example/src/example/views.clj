(ns example.views
  (:require
    [hiccup
      [page :refer [html5 include-js]]]))

(defn index-page []
  (html5
   [:head
    [:title "Hello Moon"]
    (include-js "/js/main.js")]
   [:body {:onload "example.hello.webgl_start();"}
    [:h1 "Hello Moon"]]))
