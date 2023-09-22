package com.example.openfeing;

import com.example.openfeing.client.MyTodoTodoClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenfeingApplication {

  public static void main(String[] args) {
    SpringApplication.run(OpenfeingApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner(MyTodoTodoClient client) {
    return args -> {
      System.out.println("Started!");
      System.out.println(client.findTodoById("1"));
    };
  }

}
