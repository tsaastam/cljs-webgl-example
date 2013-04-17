(ns example.views
  (:require
    [hiccup
      [page :refer [html5 include-js]]]))

(defn index-page []
  (html5
   [:head
    [:title "Hello Moon"]
    (include-js "/js/PhiloGL.js")
    (include-js "/js/main.js")]
   [:body {:onload "example.hello.webgl_start();"}
    [:h1 "Hello Moon"]
    [:p "Drag with mouse to rotate, use mouse wheel to zoom"]
    [:canvas {:id "gl-canvas"
              :width "500"
              :height "500"}]]))
