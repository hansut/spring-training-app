package com.training.spring.oldplain.service;

import com.training.spring.oldplain.repository.TrainingDao;

public interface TrainingService {
    public int countPeople();

    public void setTrainingDao( TrainingDao dao);
}
