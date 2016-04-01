(ns bob
  (:require [clojure.string :as string]))

(defn is-yelling? [statement]
  (and
   (re-find #"[A-Z]" statement)
   (= (string/upper-case statement) statement)
   ))

(defn response-for-question [statement]
  (when (string/ends-with? statement "?") "Sure."))

(defn response-for-yelling [statement]
  (when (is-yelling? statement) "Whoa, chill out!"))

(defn response-for-silence [statement]
  (when (string/blank? statement) "Fine. Be that way!"))

(defn response-for [statement]
  (or
   (response-for-silence statement)
   (response-for-yelling statement)
   (response-for-question statement)
   "Whatever."))
