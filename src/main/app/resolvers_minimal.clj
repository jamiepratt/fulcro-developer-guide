(ns app.resolvers_minimal
  (:require
   [com.wsscode.pathom.connect :as pc]))


(pc/defresolver person-resolver [_ {:person/keys [id]}]
  {::pc/input  #{:person/id}
   ::pc/output [:person/id :person/name :person/age]}
  ;; hard coded data returned :
  {:person/id 1 :person/name "Sally" :person/age 32})

(comment
    ;; call person resolver
  (person-resolver nil {:person/id 1})
    ;; => #:person{:id 1}
  (person-resolver nil {:person/id 2})
  ;; => #:person{:id 2}


  )