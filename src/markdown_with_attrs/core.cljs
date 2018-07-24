(ns markdown-with-attrs.core
  (:require [cljs-node-io.core :as io]
            [markdown-it :as md]
            [markdown-it-attrs :as mdattrs]
            [clojure.string :as string]))

;; # Simple wrapper arount markdown-it parser and markdown-it-attrs plugin
;;


(def ^:private m
 "Create private instace of the parser and configure it to use
  the markdown-it-attrs plugin"
 (-> (md.)
     (.use mdattrs)))


;; ## Exported functions


(defn markdown->html
  "Simple wrapper around npm markdown-it and npm markdown-it-attrs"
  [markdown-text]
  (.render m markdown-text))

