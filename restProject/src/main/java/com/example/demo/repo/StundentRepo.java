package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Student;

@EnableJpaRepositories
@Repository
public interface StundentRepo extends JpaRepository<Student, Integer>{

}
