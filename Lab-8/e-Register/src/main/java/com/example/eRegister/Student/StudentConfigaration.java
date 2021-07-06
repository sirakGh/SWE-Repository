package com.example.eRegister.Student;

import com.example.eRegister.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfigaration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1 = new Student("1101", "Sirak", "Solomon", "Ghebrehiwot", 3.8, LocalDate.of(2021, 9, 15), "No");
            Student s2 = new Student("1102", "John", "Habte", "Goliat", 3.98, LocalDate.of(2021, 1, 1), "No");
            Student s3 = new Student("1103", "Josiph", "Issac", "Ben", 4.0, LocalDate.of(2020, 2, 8), "Yes");

            repository.saveAll(List.of(s1,s2,s3));
        };

    }
}
