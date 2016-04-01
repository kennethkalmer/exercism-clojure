(ns rna-transcription
  (:require [clojure.string :as s]))

(def dna-rna-pairs {"G" "C"
                    "C" "G"
                    "T" "A"
                    "A" "U"})

(defn get-pair [n]
  (let [match (dna-rna-pairs (str n))]
    (when (nil? match)
      (throw (AssertionError. (str "Invalid nucleotide " n))))
    match))

(defn to-rna [strand]
  (s/join "" (map get-pair strand)))
