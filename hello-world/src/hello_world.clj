(ns hello-world)

(defn hello
  "Greet the user, or the world!"
  ([name]
   (str "Hello, " name "!"))
  ([]
   hello "World"))
