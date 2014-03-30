(ns plural.core)

(def rules (array-map
  "(?i)(z)ombies$" "$1ombies"
  "(?i)(z)ombie$" "$1ombies"
  "(?i)k(?i)ine$" "kine"
  "(?i)K(?i)ine$" "Kine"
  "(?i)c(?i)ow$" "kine"
  "(?i)C(?i)ow$" "Kine"
  "(?i)(m)oves$" "$1oves"
  "(?i)(m)ove$" "$1oves"
  "(?i)(s)exes$" "$1exes"
  "(?i)(s)ex$" "$1exes"
  "(?i)(c)hildren$" "$1hildren"
  "(?i)(c)hild$" "$1hildren"
  "(?i)(m)en$" "$1en"
  "(?i)(m)an$" "$1en"
  "(?i)(p)eople$" "$1eople"
  "(?i)(p)erson$" "$1eople"
  "(?i)(quiz)$" "$1zes"
  "(?i)^(oxen)$" "$1"
  "(?i)^(ox)$" "$1en"
  "(?i)^(m|l)ice$" "$1ice"
  "(?i)^(m|l)ouse$" "$1ice"
  "(?i)(matr|vert|ind)(?:ix|ex)$" "$1ices"
  "(?i)(x|ch|ss|sh)$" "$1es"
  "(?i)([^aeiouy]|qu)y$" "$1ies"
  "(?i)(hive)$" "$1s"
  "(?i)(?:([^f])fe|([lr])f)$" "$1$2ves"
  "(?i)sis$" "ses"
  "(?i)([ti])a$" "$1a"
  "(?i)([ti])um$" "$1a"
  "(?i)(buffal|tomat)o$" "$1oes"
  "(?i)(bu)s$" "$1ses"
  "(?i)(alias|status)$" "$1es"
  "(?i)(octop|vir)i$" "$1i"
  "(?i)(octop|vir)us$" "$1i"
  "(?i)^(ax|test)is$" "$1es"
  "(?i)s$" "s"
  "$" "s"))

(def uncountables (map str '(equipment information rice money
                             species series fish sheep jeans police)))

(defn pluralize
  [word]
  (if (some #(re-find (re-pattern %) word) uncountables)
    word
    (let [[regex rule] (first (filter #(re-find (re-pattern (key %)) word) rules))]
      (clojure.string/replace word (re-pattern regex) rule))))
