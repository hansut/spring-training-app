package com.training.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.spring.configurationAutowired.TrainingAutowiredBean;
import com.training.spring.configurationSpring.configuration.TrainingBeanConfiguration;
import com.training.spring.configurationSpring.service.TrainingService;

@SpringBootApplication
public class Application {

	private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		TrainingService trainingService1 = context.getBean("trainingService", TrainingService.class);
		logger.error("Service 1 is for singleton scope : " + trainingService1.toString());
		TrainingService trainingService2 = context.getBean("trainingService", TrainingService.class);
		logger.error("Service 2 is for singleton scope : " + trainingService2.toString());
		TrainingService trainingServiceMulti1 = context.getBean("trainingServicePerRequest", TrainingService.class);
		logger.error("Multi service 1 is " + trainingServiceMulti1.toString());
		TrainingService trainingServiceMulti2 = context.getBean("trainingServicePerRequest", TrainingService.class);
		logger.error("Multi service 2 is " + trainingServiceMulti2.toString());
        //SpringApplication.run(Application.class, args);
		TrainingAutowiredBean trainingAutowiredBean = context.getBean(TrainingAutowiredBean.class);
		logger.error("Training autowired bean is " + trainingAutowiredBean.toString());
    }

}
