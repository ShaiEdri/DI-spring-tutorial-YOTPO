package com.example.DItutorialYOTPO;

import com.example.DItutorialYOTPO.controllers.I18nController;
import com.example.DItutorialYOTPO.controllers.MyController;
import com.example.DItutorialYOTPO.controllers.PropertyInjectedController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.example.DItutorialYOTPO", "i18n"})
@SpringBootApplication
public class DiTutorialYotpoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DiTutorialYotpoApplication.class, args);
		//Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(beanName-> System.out.println(beanName) );
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayHello());

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}
