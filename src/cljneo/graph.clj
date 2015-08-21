(ns cljneo.graph
  (:require [clojurewerkz.neocons.rest :as nr]
            [clojurewerkz.neocons.rest.nodes :as nn]
            [cljneo.data :as ndata]))

;(def conn (nr/connect "http://neo4j:neoman4j@localhost:7474/db/data/"))
(def conn (nr/connect "http://127.0.0.1:7474/db/data/" "neo4j" "neoman4j"))

(defn create-interest-nodes []
  (let [interests (ndata/create-interests)]
    (mapv #(nn/create conn %) interests)))

(defn create-language-nodes []
  (let [langs (ndata/create-languages)]
    (mapv #(nn/create conn %) langs)))

(defn create-skill-nodes []
  (let [skills (ndata/create-skills)]
    (mapv #(nn/create conn %) skills)))

(defn create-education-nodes []
  (let [educations (ndata/create-education)]
    (mapv #(nn/create conn %) educations)))

(defn create-experience-nodes []
  (let [experiences (ndata/create-experience)]
    (mapv #(nn/create conn %) experiences)))

(defn create-profile-nodes []
  (let [profiles (ndata/create-profiles)]
    (mapv #(nn/create conn %) profiles)))

(defn create-resume-node []
  (nn/create conn (ndata/get-manoj)))
