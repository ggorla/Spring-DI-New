package guru.springframework.DependencyInjection;

import guru.springframework.DependencyInjection.controllers.ConstructorIngectedXontroller;
import guru.springframework.DependencyInjection.controllers.MyController;
import guru.springframework.DependencyInjection.controllers.PropertyInjectedController;
import guru.springframework.DependencyInjection.controllers.SetterinjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");



		System.out.println("--- Primary Bean");
		System.out.println(myController.SayHello());

		System.out.println("-------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter");
		SetterinjectedController setterinjectedController = (SetterinjectedController) ctx.getBean("setterinjectedController");
		System.out.println(setterinjectedController.getGreeting());

		System.out.println("----- Constructor");
		ConstructorIngectedXontroller constructorIngectedXontroller = (ConstructorIngectedXontroller) ctx.getBean("constructorIngectedXontroller");
		System.out.println(constructorIngectedXontroller.getGreeting());
	}

}
