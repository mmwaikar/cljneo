(ns cljneo.domain)

(defn create-personal-info
  [name label picture email phone website summary]
  {:name name
   :label label
   :picture picture
   :email email
   :phone phone
   :website website
   :summary summary})

;(defn create-personal-info
;  [name label picture email phone website summary location profiles]
;  {:name name
;   :label label
;   :picture picture
;   :email email
;   :phone phone
;   :website website
;   :summary summary
;   :location location
;   :profiles profiles})

(defn create-location
  [address postalCode city countryCode region]
  {:address address
   :postalCode postalCode
   :city city
   :countryCode countryCode
   :region region})

(defn create-profile
  [network username url]
  {:network network
   :username username
   :url url})

(defn create-company
  [name position website startDate endDate summary highlights]
  {:company name
   :position position
   :website website
   :startDate startDate
   :endDate endDate
   :summary summary
   :highlights highlights})

(defn create-skill
  [name level keywords]
  {:name name
   :level level
   :keywords keywords})

(defn create-institution
  [name area studyType startDate endDate gpa courses]
  {:institution name
   :area area
   :studyType studyType
   :startDate startDate
   :endDate endDate
   :gpa gpa
   :courses courses})

(defn create-language
  [name fluency]
  {:language name
   :fluency fluency})

(defn create-interest
  [name keywords]
  {:name name
   :keywords keywords})

(defn create-reference
  [name contact-number]
  {:name name
   :contact-number contact-number})

(defn create-resume
  [basics work volunteer education awards publications skills languages interests references]
  {:basics basics
   :work work
   :volunteer volunteer
   :education education
   :awards awards
   :publications publications
   :skills skills
   :languages languages
   :intetests interests
   :references references})
