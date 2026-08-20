package com.example.spring_core_concepts;

import com.example.spring_core_concepts.DI.constructorInjection.OrderService1;
import com.example.spring_core_concepts.DI.fieldInjection.OrderService;
import com.example.spring_core_concepts.DI.setterInjection.OrderService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		OrderService os = context.getBean(OrderService.class);
//		OrderService os = new OrderService();// NPE
		os.placeOrder();
		context.close();
	}

}
