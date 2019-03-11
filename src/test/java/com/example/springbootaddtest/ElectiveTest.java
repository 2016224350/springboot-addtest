package com.example.springbootaddtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElectiveTest {
    @Autowired
    private ElectiveRepository electiveRepository;
    @Test
    public void addElectiveTest(){
        electiveRepository.addElective();
    }
}
