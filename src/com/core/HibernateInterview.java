package com.core;

public class HibernateInterview {
/**
Query	// interface, Hibernate(org.hibernate) + JPA(javax.persistence)
Query(Object) = em.createQuery("Select u from User u where user.id=:userId");
TypedQuery<User> q = em.createQuery("Select u from User u")	// sub-interface
NamedQuery	// sub-interface
NativeQuery	// (select * from user where name = '')
Criteria API	
NamedNativeQuery User.getAll
User u = .getRefernce(); //
load/get/getReference(only id)
Object save/(void)saveorUpdate/persist(void)
merge/update
Update: if you are sure that the session does not contains an already persistent instance with the same identifier,then use update to save the data in hibernate
Merge: if you want to save your modifications at any time with out knowing about the state of an session, then use merge() in hibernate.
@Table/@Entity
Proxy Objects (copy of original data) ->  // session -> User -> update /// update // commit -> 

transient/persist/detached 

sequence // how to manage sequence using hibernate/jpa ? when sequence is generated ?
index	 // 
Session
SessionFactory

@Embeddable
@Embeddable
mapped-super-class extends	-> @Id

Automatic dirty checking	

@OneToOne
@OneToMany
@ManyToOne
@ManyToMany

@CollectionTable

CascadeTypes -> ALL, PERSIST, MERGE, REMOVE, REFRESH, DETACH

Lazy/Eager Initialization

Caching Levels -> first(enable), second(redis), query-level caching ->
Transaction

@Transaction (Spring vs Hibernate) -> beginTransaction + commit +  (rollback) + close

saveOrUpdate

@PersistencContext	// 
EntityManager em;


@GeneratedValue

JPA vs. Hibernate methods
Importrtance of No-args constructor in Entity
Hibernate validator
What is N+1 SELECT problem in Hibernate? 
Does Hibernate Session interface thread-safe in Java? No
Does SessionFactory thread-safe in Hibernate? Yes
What is different between Session and SessionFactory in Hibernate
session.lock() 
difference between sorted and ordered collection in Hibernate
inheritance models are of hibernate
difference between managed associations and hibernate associations?
 * 
 */
}
