(ns xmas.questions)

(def questions
  [
   {:icon :blue-bow :a "cards" :q "8th Light's very first project involved a pink box.  What was kept in that box?"}
   {:icon :blue-flake :a "ruby & applescript" :q "What programming language controls the wall-mounted TV's web page cycle?"}
   {:icon :blue-gift :a "zero" :q "How many Rails apps had Micah and Paul written when 8th Light signed their first paying Rails gig?"}
   {:icon :blue-ornament :a "PCReservation" :q "What 8th Light developed software runs in the Chicago Public Library?"}
   {:icon :red-ornament :a "0-8" :q "What is the record of 8th Light's basketball team?"}
   {:icon :red-star :a "Take a picture and email it to Stefan" :q "What did the silver button the iMac do?"}
   {:icon :reindeer :a "Closet at Object Mentor" :q "Where was 8th Light first office?"}
   {:icon :santa-hat :a "C++" :q "Ruby was the first language in which 8th Light was paid to develop.  What was the second?"}
   {:icon :santa-letter :a "Jake Scruggs" :q "What was the name of the Obtivian who visited 8th Light in the innagural Craftsman Swap?"}
   {:icon :santa-sack :a "PDF" :q "'Eric the Great and Powerful' originally appeared in what type of file?"}
   {:icon :sleigh :a "Zebra" :q "What company supplied the labels that were used to create the printer label ball that can be found in the office?"}
   {:icon :snow-globe :a "LandsEnd" :q "Several 8th Light craftsmen modeled clothing for what brand name appearal?"}
   {:icon :snowballz :a "45" :q "How many people are on 8th Light's payroll?"}
   {:icon :snowman :a "54" :q "How many 8thlight.com email address boxes does 8th Light host?"}
   {:icon :snowy-house :a "37-38" :q "Including finance, sales, admin, but not apprentices, how many 8th Light Craftsmen are there?"}
   {:icon :stocking :a "FrescoPlusNormal" :q "What is the name of the primary font used on 8thlight.com?"}
   {:icon :teddy-gift :a "Infrared" :q "What color is the 8th Light?"}
   {:icon :treasure-chest :a "A well-crafted spirit for a well-spirited craftsman." :q "What is the motto behind 8th Light's birthday scotch tradition?"}
   {:icon :wreath :a "Techline" :q "From what company does the majority of 8th Light's furnature come?"}
   {:icon :green-ornament :a "$10-$12" :q "How much does 1 quality juggling ball cost?"}
   {:icon :pink-flake :a "1 min" :q "Roughly, what is the 8th Light record time for solving the Rubik's Cube (3x3x3)?"}

   {:icon :balloons :a "<secret>" :q "What is Myles' middle name?"}
   {:icon :blue-star :a "Angelique Martin" :q "I was born on a Carribean Island and can understand Creole. Who am I?"}
   {:icon :cake :a "Craig Demyanovich" :q "This craftsman dreams of sticks, disks, and lots-o mighty cold H2O"}
   {:icon :candy-cane :a "Eric Meyer" :q "I have a master on each shoulder.  One light.  One dark.  Who am I?"}
   {:icon :candy-house :a "Josh Cheek" :q "If you needed a knitted snifter warmer, which craftsman should you seek?"}
   {:icon :christmas-tree :a "Paul Pagel" :q "Which craftsman rides a Triumph?"}
   {:icon :christmas-card :a "Wai Lee" :q "Which craftsman most resembles Beatles rock star, George Harrison?"}
   {:icon :cookies :a "Skim" :q "Which craftsman owns a bright yellow drifer car in another state?"}
   {:icon :gift-tags :a "Sue Kim" :q "Which craftsman lives with a retired proffessional track runner?"}
   {:icon :ginger-guy :a "Jim Suchy" :q "8th Light Employee #1"}
   {:icon :ginger-stocking :a "Doug Bradbury" :q "This craftman dug through other people's crap to produce a gem that thousands of craftsman can attest to."}
   {:icon :ginger-tree :a "Colin Jones" :q "Undoubtedl-y, this craftman-y can ver-y cleverl-y name things-y."}
   {:icon :gold-bell :a "Margaret Pagel" :q "This craftsman was in the dental industry prior to joining 8th Light."}
   {:icon :red-candles :a "Eric Koslow" :q "Had this craftsman from the big apple chosen the wrong school, he'd be speaking Japaneese instead of writting code."}
   {:icon :red-gift :a "Nick Meccia" :q "Which craftsman has produced their very own music comic book?"}
   {:icon :gold-gift :a "Dave Moore" :q "I go to war almost every other weekend. No one dies and if I'm lucky, I get paid.  Who am I?"}
   {:icon :green-gift :a "Patrick Gombert" :q "This craftsman has double jointed elbows (wierd!) and was voted 'worst case of senioritus' in high school."}
   {:icon :icy-earth :a "Keven Liddle" :q "This craftman has never experienced a brain freeze and has been known to sprinkle the day with dance moves."}
   {:icon :gold-flake :a "Susan Rosso" :q "This saxaphone playing craftsman is a fan of Leonard Nimoy as Spok from the classic Star Trek."}
   {:icon :pink-ornament :a "Brian Pratt" :q "This chili cooking champ of a craftsman is scared of hair cuts."}
   {:icon :polkadot-gift :a "Cymen Vig" :q "This craftsman is, perhaps was, a cow milker and rusty pick-up truck owner."}
   {:icon :holly :a "Mike Jansen" :q "You'd be calling this craftsman Spike or Butch if their old-man had their way."}
   {:icon :gold-star :a "Michael Baker" :q "This craftsman was the proud owner of a sugar glider (WTF?) and nearly became a humanities teacher."}
   {:icon :igloo :a "Li-Hsuan Lung" :q "This craftmsn has family ties with the mafia and an army general.  That translates to power!"}
   {:icon :heart :a "Ginny Hendry" :q "This self-qualifiying 'tall' craftsman hates the color pink."}
   {:icon :green-bow :a "Stephanie Briones" :q "This nomadic craftsman has lived in 5 states and would be playing the drums today if not for the close proximity of Chicago neighbors."}
   {:icon :jingle-bell :a "Jeremy Neander" :q "This craftsman has a soft spot for meandering blank-and-white animals."}
   {:icon :mistletoe :a "Dariuz Pasciak" :q "This craftsman eats chicken soup 6 times a week.  How Daring!"}
   {:icon :red-bow :a "Ben Voss" :q "A true boy scout, eagle in fact, this craftsman is the boss of long walks."}
  ])

(defn clue-for [icon]
  (when-let [entry (first (filter #(= icon (:icon %)) questions))]
    (:q entry)))

(defn all-icons []
  (map :icon questions))














