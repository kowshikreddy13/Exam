package com.mru.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mru.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, java.lang.Integer> {

}
