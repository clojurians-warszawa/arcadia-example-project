(ns game.core
  (use arcadia.core 
       arcadia.linear)
  (import [UnityEngine Transform Time]))


(log "Hello, Arcadia!")

; object
(def cube (object-named "Cube"))

; component
(def transform (cmpt cube Transform)) 

; property
(.localPosition transform)

; method
(.Rotate transform (v3))

; static member
(Time/deltaTime)

(defn cube-update [go]
  (.Rotate transform (* (Time/deltaTime) 10) 0 0))

(hook+ cube :update #'game.core/cube-update)
