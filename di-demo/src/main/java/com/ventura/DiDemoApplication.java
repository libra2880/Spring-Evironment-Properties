package com.ventura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ventura.controller.ConstructorInjectedController;
import com.ventura.controller.GetterInjectedController;
import com.ventura.controller.MyController;
import com.ventura.controller.PropertyInjectedController;
import com.ventura.ejemplobean.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ventura","com.ventura.service"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController controller=(MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		/*
		 * System.out.println(controller.hola());
		 * System.out.println(ctx.getBean(PropertyInjectedController.class).decirHola())
		 * ;
		 * System.out.println(ctx.getBean(GetterInjectedController.class).decirHola());
		 * System.out.println(ctx.getBean(ConstructorInjectedController.class).decirHola
		 * ());
		 */
	
	}

}
