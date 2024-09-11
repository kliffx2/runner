package dev.kliffx2.runnerz;

import hello.world.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		var HelloWorld = new HelloWorld();
		System.out.println(HelloWorld.sayHello());
	}

}
