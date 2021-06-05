(ns estoque.aula5)

(def estoque { "Mochila" 10 , "Camiseta" 5 })
(println estoque)

(println "Temos" (count estoque) "elementos")
(println  "Chaves são:" (keys estoque))
(println  "Chaves são:" (vals estoque))

;Keyword :mochila
(def estoque {:mochila 10
              :camiseta 5})

;Assoc associa
(println (assoc estoque :cadeira 3))

;Remove um elemento
(println (dissoc estoque :mochila))

(def pedido {:mochila  { :quantidade 2, :preco 80}
             :camiseta { :quantidade 3, :preco 40}})

(println "\n\n\n\n")
(println pedido)

(def pedido (assoc pedido :chaveiro { :quantidade 1, :preco 10 }))
(println pedido)

(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira))

(println (:mochila pedido))
(println (:cadeira pedido {}))

(println (:quantidade (:mochila pedido)))

(println (update-in pedido [:mochila :quantidade] inc))


(println "\n\n\n\n")

;THREADING ( Encadeamento )
(println (-> pedido
             :mochila
             :quantidade))