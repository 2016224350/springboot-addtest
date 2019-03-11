package com.example.springbootaddtest;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class ElectiveRepository {
    @PersistenceContext
    private EntityManager em;
    public void addElective(){
        Student s1 = new Student("s1");
        em.persist(s1);
        Student s2 = new Student("s2");
        em.persist(s2);
        Course c1 = new Course("c1");
        em.persist(c1);
        Course c2 = new Course("c2");
        em.persist(c2);
        Course c3 = new Course("c3");
        em.persist(c3);
        Elective e1 = new Elective(s1,c1);
        em.persist(e1);
        Elective e2 = new Elective(s1,c2);
        em.persist(e2);
        Elective e3 = new Elective(s2,c2);
        em.persist(e3);
        Elective e4 = new Elective(s2,c3);
        em.persist(e4);
    }
}
