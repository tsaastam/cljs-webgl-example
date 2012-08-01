(ns example.hello)

(defn to-js [x]
  (cond (map? x)
        (let [out (js/Object.)]
          (dorun (for [[k v] x]
                   (aset out (name k) (to-js v))))
          out)
        
        (= (type x) (type []))
        (apply array (map to-js x))

        :else x))

(defn on-error []
  (js/alert "There was an error creating the app."))

(defn init [canvas scene gl]
  (.clearColor gl 0.0 0.0 0.0 1.0)
  (.clearDepth gl 1.0)
  (.enable gl (.-DEPTH_TEST gl))
  (.depthFunc gl (.-LEQUAL gl))
  (.viewport gl 0 0 (.-width canvas) (.-height canvas)))

(defn draw [canvas scene gl]
  (.clear gl (bit-or (.-COLOR_BUFFER_BIT gl) (.-DEPTH_BUFFER_BIT gl)))
  (.render scene))

(defn on-load [app]
  (let [canvas (.-canvas app)
        scene (.-scene app)
        gl (.-gl app)]
    (init canvas scene gl)
    ((fn draw-and-request []
       (draw canvas scene gl)
       (js/PhiloGL.Fx.requestAnimationFrame draw-and-request)))))

(def camera
  {:position {:x 0 :y 0 :z -7}})

(defn webgl-start []
  (js/PhiloGL
   "gl-canvas"
   (to-js {:camera camera
           
           :onError on-error
           
           :onLoad on-load})))
