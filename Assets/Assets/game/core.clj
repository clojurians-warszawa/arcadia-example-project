(ns game.core
  (use arcadia.core 
       arcadia.linear)
  (import [UnityEngine Transform Time]))


(log "Hello, Arcadia!")

; object
(def cube (object-named "Cube"))
; C# GameObject.Find 
; (GameObject/Find name)
(.SetActive cube false)


; component
(def transform (cmpt cube Transform)) 
; .GetComponent<Transform>()
; clojure CLR: (.GetCompnent (type-arga Transform)
; List<int>
; |System.CollList`1|

; (Int32/Parse)
; int.Parse
; yield (IEnumerable) -> reify
f (int)
{ 
yield return 1;
yield return2;
 } 


; property
(.localPosition transform)

for if genr
(f a b c)

; method
(.Rotate transform (v3)) ; Vector3 (1 1 1)

; static member
(Time/deltaTime)



;; a - b
(let [a 10
      (+ b 20)] ())
(+) () (rand-int 2)

(def child (comp first children))

(f a)

int.
; int
(f)

(-> (object-named "Bet")
    ())

(set! (. cube name) "asdf")
()
;; C# cube.name
;; DRY


(defn cube-update [go]
  (.Rotate transform (* (Time/deltaTime) 10) 0 0))

(hook+ cube :update #'game.core/cube-update)

:late-update
:start ;; inicjalit, 

(if cond?
  (do 
    (log a)
    (.mutate a)))
