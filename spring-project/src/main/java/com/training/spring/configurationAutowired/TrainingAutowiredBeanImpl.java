package com.training.spring.configurationAutowired;

import org.springframework.stereotype.Component;

@Component
public class TrainingAutowiredBeanImpl implements TrainingAutowiredBean{

    @Override
    public int calculateNumberOfAttendees() {

        return 0;
    }
}
