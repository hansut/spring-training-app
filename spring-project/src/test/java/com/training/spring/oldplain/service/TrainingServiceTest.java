package com.training.spring.oldplain.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.training.spring.oldplain.repository.TrainingDaoImpl;

public class TrainingServiceTest {

    @Test
    void test() {

        TrainingService service = new TrainingServiceImpl(new TrainingDaoImpl());
        Assertions.assertEquals(9, service.countPeople());
    }
}
