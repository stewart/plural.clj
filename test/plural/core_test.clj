(ns plural.core-test
  (:require [clojure.test :refer :all]
            [plural.core :refer :all]))

(def singular-to-plural-pairs {
  "search"       "searches"
  "switch"       "switches"
  "fix"          "fixes"
  "box"          "boxes"
  "process"      "processes"
  "address"      "addresses"
  "case"         "cases"
  "stack"        "stacks"
  "wish"         "wishes"
  "fish"         "fish"
  "jeans"        "jeans"
  "funky jeans"  "funky jeans"
  "my money"     "my money"

  "category"     "categories"
  "query"        "queries"
  "ability"      "abilities"
  "agency"       "agencies"
  "movie"        "movies"

  "archive"      "archives"

  "index"        "indices"

  "wife"         "wives"
  "safe"         "saves"
  "half"         "halves"

  "move"         "moves"

  "salesperson"  "salespeople"
  "person"       "people"

  "spokesman"    "spokesmen"
  "man"          "men"
  "woman"        "women"

  "basis"        "bases"
  "diagnosis"    "diagnoses"
  "diagnosis_a"  "diagnosis_as"

  "datum"        "data"
  "medium"       "media"
  "stadium"      "stadia"
  "analysis"     "analyses"

  "node_child"   "node_children"
  "child"        "children"

  "experience"   "experiences"
  "day"          "days"

  "comment"      "comments"
  "foobar"       "foobars"
  "newsletter"   "newsletters"

  "old_news"     "old_news"
  "news"         "news"

  "series"       "series"
  "species"      "species"

  "quiz"         "quizzes"

  "perspective"  "perspectives"

  "ox"           "oxen"
  "photo"        "photos"
  "buffalo"      "buffaloes"
  "tomato"       "tomatoes"
  "dwarf"        "dwarves"
  "elf"          "elves"
  "information"  "information"
  "equipment"    "equipment"
  "bus"          "buses"
  "status"       "statuses"
  "status_code"  "status_codes"
  "mouse"        "mice"

  "louse"        "lice"
  "house"        "houses"
  "octopus"      "octopi"
  "virus"        "viri"
  "alias"        "aliases"
  "portfolio"    "portfolios"

  "vertex"       "vertices"
  "matrix"       "matrices"
  "matrix_fu"    "matrix_fus"

  "axis"         "axes"
  "testis"       "testes"
  "crisis"       "crises"

  "rice"         "rice"
  "shoe"         "shoes"

  "horse"        "horses"
  "prize"        "prizes"
  "edge"         "edges"

  "cow"          "kine"
  "database"     "databases"

  "|ice"         "|ices"
  "|ouse"        "|ouses"
  })

(deftest plurals
  (testing "Singular To Plural"
      (doseq [[singular plural] singular-to-plural-pairs]
        (is (= (pluralize singular) plural))))

  (testing "Plural To Plural"
    (doseq [[singular plural] singular-to-plural-pairs]
      (is (= (pluralize plural) plural)))))
