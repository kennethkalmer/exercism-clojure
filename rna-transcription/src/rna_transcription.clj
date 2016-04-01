(ns rna-transcription
  (:require [clojure.string :as s]))

(def dna->rna {\G \C
               \C \G
               \T \A
               \A \U})

(defn get-pair [n]
  (assert (contains? dna->rna n))
  (dna->rna n))

(defn to-rna [strand]
  (s/join (map get-pair strand)))
