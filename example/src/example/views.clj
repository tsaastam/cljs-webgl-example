(ns example.views
  (:require
    [hiccup
      [page :refer [html5 include-js]]]))

(defn index-page []
  (html5
   [:head
    [:title "Hello Moon"]]
   [:body
    [:h1 "Hello Moon"]]))
