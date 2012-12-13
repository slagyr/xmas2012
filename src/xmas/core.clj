(ns xmas.core
  (:require [xmas.questions :refer :all]
            [hiccup.core :refer [html]]
            [clojure.java.io :refer [file]]))

(defn create-game-sheet [icon]
  (let [valid-clues (filter #(not (= icon (:icon %))) questions)
        shuffled-clues (shuffle valid-clues)]
    {:icon icon
     :clue (clue-for icon)
     :bingo (map :icon (take 25 shuffled-clues))}))

(defn render-game-sheet [sheet]
  (let [html (html (pr-str sheet))
        outfile (file "output" (str (name (:icon sheet)) ".html"))]
    (spit outfile html)))



