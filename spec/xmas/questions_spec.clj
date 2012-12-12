(ns xmas.questions-spec
  (:require [speclj.core :refer :all]
            [xmas.questions :refer :all]))

(describe "Questions"

    (it "has 50 questions"
      (should= 50 (count questions)))

    )

