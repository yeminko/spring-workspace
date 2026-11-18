package com.plandoer.sm;

import com.plandoer.sm.domains.Student;
import com.plandoer.sm.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner testDatabase(StudentRepository studentRepository) {
        return args -> {
            Student student = new Student();
            student.setName("John Doe");
            student.setEmail("john@gmail.com");

            studentRepository.save(student);

            studentRepository.findAll().forEach(System.out::println);
        };
    }

}