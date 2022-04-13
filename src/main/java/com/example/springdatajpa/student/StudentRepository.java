package com.example.springdatajpa.student;

/*
    StudentRepository Class:
     - Acts as Data Access Layer to allow for CRUD operations
     - Spring Data repository abstraction significantly reduces amount of boilerplate code
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
