package com.training.spring.configurationSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.spring.configurationSpring.repository.TrainingDao;
import com.training.spring.configurationSpring.repository.TrainingDaoImpl;
import com.training.spring.configurationSpring.service.TrainingService;
import com.training.spring.configurationSpring.service.TrainingServiceImpl;

@Configuration
public class TrainingBeanConfiguration {

    @Bean
    public TrainingServiceImpl trainingService( TrainingDao dao) {
        return new TrainingServiceImpl(dao);
    }

    @Bean
    public TrainingDao trainingDao() {
        return new TrainingDaoImpl();
    }

    @Bean
    @Scope("prototype")
    public TrainingService trainingServicePerRequest( TrainingDao dao) {
        return new TrainingServiceImpl( dao );
    }


}
