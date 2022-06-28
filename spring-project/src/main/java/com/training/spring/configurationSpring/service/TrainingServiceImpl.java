package com.training.spring.configurationSpring.service;

import com.training.spring.configurationSpring.repository.TrainingDao;

public class TrainingServiceImpl implements TrainingService {


    TrainingDao trainingDao = null;

    public TrainingServiceImpl(TrainingDao trainingDao) {

        this.trainingDao = trainingDao;
    }

    @Override
    public void setTrainingDao(TrainingDao dao) {
        trainingDao = dao;
    }

    @Override
    public int countPeople() {

        return trainingDao.countPeopleInKitchen() + trainingDao.countPeopleInRoom();
    }
}
