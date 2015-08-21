(ns cljneo.data
  (:require [cljneo.domain :as ndom]
            [clj-time.core :as t]
            [clj-time.coerce :as c]))

(defn create-interests []
  (let [music (ndom/create-interest "Music" (vector "Singing" "Guitar"))
        reading (ndom/create-interest "Reading" (vector "Richard Bach" "Paulo Coelho" "Dr. Brian Weiss"))]
    (vector music reading)))

(defn create-languages []
  (let [english (ndom/create-language "English" "Fluent")
        hindi (ndom/create-language "Hindi" "Native Speaker")
        marathi (ndom/create-language "Marathi" "Native Speaker")]
    (vector english hindi marathi)))

(defn create-skills []
  (let [csharp (ndom/create-skill "C#" "Expert" (vector "Asp.Net Web API" "Asp.Net MVC" "Asp.Net" "MassTransit"
                                                      "TopShelf" "Entity Framework" "NHibernate" "Spring.Net"
                                                      "Castle Windsor" "Moq" "NUnit" "AutoMapper" "WPF"
                                                      "Silverlight" "WinForms"))
        web (ndom/create-skill "Web Development" "Advanced" (vector "JavaScript" "AngularJS" "Underscore.js"
                                                                  "String.js" "jQuery" "Yeoman (Yo Grunt Bower)"
                                                                  "HTML" "CSS"))
        db (ndom/create-skill "RDBMS" "Expert" (vector "SQL Server" "Oracle" "PostgreSql"))
        nosql (ndom/create-skill "NoSQL" "Intermediate" (vector "MongoDB" "Neo4j"))
        ;design-patterns agile vcs others
        clojure (ndom/create-skill "Clojure" "Intermediate" (vector "Enlive"))]
    (vector csharp web db nosql clojure)))

(defn create-education []
  (let [cdac (ndom/create-institution "CDAC, ACTS, Pune" "Pune" "Software" (c/to-date (t/date-time 1998 7 1))
                                    (c/to-date (t/date-time 1999 1 31)) "" (vector "Databases" "Networking"))
        mba (ndom/create-institution "Institute of Productivity and Management" "Meerut"
                                   "Post Graduate Diploma in Business Management" (c/to-date (t/date-time 1995 8 1))
                                    (c/to-date (t/date-time 1997 5 31)) "6" (vector "Marketing" "Accounting"))
        bsc (ndom/create-institution "Lachoo Memorial College of Science and Technology" "Jodhpur"
                                   "B. Sc. (Computer Science)" (c/to-date (t/date-time 1992 7 1))
                                    (c/to-date (t/date-time 1995 5 31)) "68.5" (vector "Physics" "Maths" "Computers"))]
    (vector cdac mba bsc)))

(defn create-experience []
  (let [intelliheads (ndom/create-company "Intelliheads Technology Pvt. Ltd." "Technical Project Manager"
                                        "http://www.intelliheads.com" (c/to-date (t/date-time 2013 10 1))
                                          (c/to-date (t/date-time 2014 9 15))
                                        "Build and deliver the self service portal using AngularJS, Bootstrap for the
                                        frontend and WebAPI for the backend. Enhance ProxyClient - a parental control
                                        software which uses Komodia SDK to control access to Internet. The software
                                        contains a windows service which wraps the Komodia SDK and decides if a
                                        particular TCP/IP connection (to Internet) should be allowed. A small system
                                        tray application called Notify Icon lets the user know about the state of the
                                        windows service."
                                        (vector
                                          "Use Angular controllers directives resource service http service and factories"
                                          "Implemented REST services using Web API" "Use Yeoman – Yo Grunt and Bower to
                                          manage JS dependencies scaffolding controllers services etc."
                                          "Use Underscore.js for writing functional JS" "Use EF code-first to interact
                                          with DB and migrations for agile database management"
                                          "Implemented a build script using FAKE – F# Make"))]
    (vector intelliheads)))

(defn create-profiles []
  (let [twitter (ndom/create-profile "Twitter" "mmwaikar" "https://twitter.com/mmwaikar")
        github (ndom/create-profile "Github" "mmwaikar" "https://github.com/mmwaikar")]
    (vector twitter github)))

(defn get-manoj []
  (let [location (ndom/create-location "4/3 Tara Residency, Opposite PMC Office, Kothrud" "411038" "Pune" "IN"
                                     "Maharashtra")
        personalInfo (ndom/create-personal-info "Manoj Waikar" "Technical Architect, Polyglot programmer" ""
                                       "manoj_w@yahoo.com" "+91 86007 18432" "http://mmwaikar.wordpress.com"
                                       "I love programming and have shipped unit tested software using Clojure,
                                       AngularJS, JavaScript, C# and Java. I've written a few build scripts in F# using
                                       FAKE. Open to any interesting work that utilizes front-end JS frameworks like
                                       AngularJS or any of the functional languages like F#, Clojure, Erlang or
                                       Haskell." location (create-profiles))
        resume (ndom/create-resume personalInfo (create-experience) [] (create-education) [] [] (create-skills)
                                 (create-languages) (create-interests) [])]
    resume))