package com.heh.projetjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositories
public class Configuration {
        @Autowired
        private StudentRepository studentRepository;

        private StudentMapper studentMapper = new StudentMapper();

        @Bean
        StudentListUseCase getStudentListUseCase(){

            return new StudentPersistenceAdapter(studentRepository,studentMapper);
        }

}
