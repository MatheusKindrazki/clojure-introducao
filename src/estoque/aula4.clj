(ns estoque.aula4)

(def precos [30 700 1000])

(println (update precos 0 inc))
(println (update precos 1 dec))

(defn soma-1
  [valor]
  (println "estou somando um em" valor)
  (+ valor 1))

(println (update precos 0 soma-1))

(defn soma-3
  [valor]
  (println "estou somando 3 em" valor)
  (+ valor 3))

(println (update precos 0 soma-3))

;CÓDIGO DA AULA ANTERIOR

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "map" (map valor-descontado precos))

(println (range 10))
(println (filter even? (range 10)))

(println "Filter " (filter aplica-desconto? precos))

(println "map apos o filter" (map valor-descontado (filter aplica-desconto? precos)))

(println (reduce + precos))

(defn minha-soma
  [valor1 valor2]
  (println "Somando" valor1 valor2)
  (+ valor1 valor2))

(println (reduce minha-soma 0 p))
;(println (reduce minha-soma (range 10)))


