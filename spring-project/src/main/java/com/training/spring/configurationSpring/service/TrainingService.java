package com.training.spring.configurationSpring.service;

import com.training.spring.configurationSpring.repository.TrainingDao;

public interface TrainingService {
    public int countPeople();

    public void setTrainingDao( TrainingDao dao);
}
