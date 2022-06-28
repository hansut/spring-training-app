package com.training.spring.configurationSpring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.training.spring.configurationSpring.repository.TrainingDao;


public class TrainingServiceManyInstanceImpl implements TrainingService {


    @Override
    public int countPeople() {

        return 0;
    }

    @Override
    public void setTrainingDao(TrainingDao dao) {

    }
}
