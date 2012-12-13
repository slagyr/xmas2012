(ns xmas.questions-spec
  (:require [speclj.core :refer :all ]
            [clojure.java.io :refer [resource file]]
            [xmas.questions :refer :all ]))

(describe "Questions"

  (it "has 50 questions"
    (should= 50 (count questions)))

  (it "each question has an icon"
    (doseq [q questions]
      (should-contain :icon q)
      (should= clojure.lang.Keyword (class (:icon q)))))

  (it "each icon has an image"
    (doseq [q questions]
      (let [filename (format "images/%s.png" (name (:icon q)))]
        (should-contain (name (:icon q)) (str (resource filename))))))

  (it "each clue has a question and answer"
    (doseq [c questions]
      (should-contain :q c)
      (should-contain :a c)))

  (it "each icon is unique"
    (should= 50 (count (into #{} (map :icon questions)))))

  (it "each question is unique"
    (should= 50 (count (into #{} (map :q questions)))))

  (it "each answer is unique"
    (should= 50 (count (into #{} (map :a questions)))))

  (it "knows the clue given an icon"
    (should= "What color is the 8th Light?" (clue-for :teddy-gift)))

  (it "can get all icons"
    (should= 50 (count (all-icons)))
    (should= #{clojure.lang.Keyword} (set (map class (all-icons)))))

  (it "generates answers"
    (render-answers)
    (.open (java.awt.Desktop/getDesktop) (file "output/answers.html")))

  )

