(require '[sci.impl.load] :reload)
(require '[sci.core :as sci] :reload)

(def ctx (sci/init {}))

(sci/add-js-lib! ctx "fs" js/fs)

(sci/eval-form ctx '(do (require '["fs" :as fs] '[clojure.string :as str])
                        (first (str/split-lines (fs/readFileSync "README.md" "utf-8")))))
