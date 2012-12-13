(ns xmas.core
  (:require [xmas.questions :refer :all ]
            [hiccup.core :refer [html]]
            [hiccup.page :refer [html5 include-css]]
            [hiccup.element :refer [image]]
            [chee.string :refer [title-case]]
            [clojure.java.io :refer [file]]))

(defn create-game-sheet [icon]
  (let [valid-clues (filter #(not (= icon (:icon %))) questions)
        shuffled-clues (shuffle valid-clues)]
    {:icon icon
     :clue (clue-for icon)
     :bingo (map :icon (take 25 shuffled-clues))}))

(defn generate-html [sheet]
  (html
    (html5 {}
      [:head (include-css "../resources/xmas.css")]
      [:body [:div#main {}
              [:img.el {:src "../resources/8l.png"}]
              [:img.bingo {:src "../resources/bingo.png"}]
              [:div#details {}
               [:h1 "You are the "
                [:span.blue (title-case (name (:icon sheet)))]]
               [:img.icon {:src (format "../resources/images/%s.png" (name (:icon sheet)))}]
               [:div.clue [:span.clue "Your clue:"] (:clue sheet)]]
              [:div#bingo
               (for [cell (:bingo sheet)]
                 [:div.cell
                  [:p (title-case (name cell))]
                  [:img {:src (format "../resources/images/%s.png" (name cell))}]])]]])))

(defn render-game-sheet [sheet]
  (let [html (generate-html sheet)
        outfile (file "output" (str (name (:icon sheet)) ".html"))]
    (spit outfile html)))









