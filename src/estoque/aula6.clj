(ns estoque.aula6)

(def pedido {:mochila  { :quantidade 2, :preco 80}
             :camiseta { :quantidade 3, :preco 40}})

(defn imprime-e-15 [[chave valor]]
  (println chave "e" valor)
  15)

(println (map imprime-e-15 pedido))

(defn preco-dos-produtos [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-dos-produtos pedido))

(println (reduce + (map preco-dos-produtos pedido)))

(println "\n\n\n\n")

(defn total-do-pedido
  [pedido]
  (reduce + (map preco-dos-produtos pedido)))

(println (total-do-pedido pedido))

(defn total-do-pedido
  [pedido]
  (reduce + (map preco-dos-produtos pedido)))

(println (total-do-pedido pedido))


;Thread last
(defn total-do-pedido
  [pedido]
  (->> pedido
      (map preco-dos-produtos)
      (reduce +)))

(println (total-do-pedido pedido))

(println "\n\n\n\n")

(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto)
       (reduce +)))

(println (total-do-pedido pedido))

(def pedido {:mochila  { :quantidade 2, :preco 80}
             :camiseta { :quantidade 3, :preco 40}
             :chaveiro { :quantidade 1}})

(defn gratuito?
  [item]
  (<=(get item :preco 0) 0))

(println "Filtrando itens gratuitos")

(println (filter (fn [[chave item ]] (gratuito? item)) pedido))
(println (filter #(gratuito? (second %)) pedido))

(defn pago?
  [item]
  (not (gratuito? item)))

(println (pago? {:preco 50}))
(println (pago? {:preco 0}))

(println ((comp not gratuito?) {:preco 50}))

(def pago? (comp not gratuito?))

(println (pago? {:preco 50}))
