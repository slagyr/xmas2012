(ns xmas.core-spec
  (:require [speclj.core :refer :all]
            [clojure.java.io :refer [file]]
            [xmas.core :refer :all]
            [xmas.questions :refer :all]))

(describe "xmas Core"

  (it "game sheet has an icon and 25 bingo squares"
    (let [sheet (create-game-sheet :igloo)]
      (should= :igloo (:icon sheet))
      (should= (clue-for :igloo) (:clue sheet))
      (should= 25 (count (:bingo sheet)))
      (should= #{clojure.lang.Keyword} (set (map class (:bingo sheet))))))

  (it "game sheets do not contain icon in bingo"
    (let [sheets (take 100 (map #(create-game-sheet %) (repeat :sleigh)))]
      (doseq [sheet sheets]
        (should-not-contain :sleigh (set (:bingo sheet))))))

  (it "game sheets bingo icons are random"
    (let [sheets (take 100 (map #(create-game-sheet %) (repeat :sleigh)))]
      (should= 100 (count (set (map #(set (:bingo %)) sheets))))))


  (it "renders a game sheet"
    (render-game-sheet
      (create-game-sheet :igloo))
    (.open (java.awt.Desktop/getDesktop) (file "output/igloo.html")))


  )



