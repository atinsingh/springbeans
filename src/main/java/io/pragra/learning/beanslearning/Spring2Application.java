package io.pragra.learning.beanslearning;

import io.pragra.learning.beanslearning.beans.Employee;
import io.pragra.learning.beanslearning.service.EmployeeService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// 2 kind of injection -- setter based injection
@SpringBootApplication
public class Spring2Application {


    public static void main(String[] args) {
      ApplicationContext context =   SpringApplication.run(Spring2Application.class, args);
        EmployeeService service =
                context.getBean("employeeService", EmployeeService.class);

        System.out.println(service);
        EmployeeService service2 =
                context.getBean("employeeService", EmployeeService.class);

        System.out.println(service2);

    }



}
