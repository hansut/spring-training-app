package com.training.spring.oldplain.repository;


public class TrainingDaoImpl implements TrainingDao  {

    @Override
    public int countPeopleInRoom() {

        return 4;
    }

    @Override
    public int countPeopleInKitchen() {

        return 5;
    }
}
