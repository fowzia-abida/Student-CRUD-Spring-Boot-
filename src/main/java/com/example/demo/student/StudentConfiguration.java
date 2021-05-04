package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository)
    {
        return args ->{


            Student fowzia_abida = new Student(
                    "Fowzia Abida",
                    "fowzia@gmail.com",
                    LocalDate.of(2000, APRIL, 25)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, APRIL, 25)
            );
            repository.saveAll(
                    List.of(fowzia_abida, alex)
            );

        };
    }
}
