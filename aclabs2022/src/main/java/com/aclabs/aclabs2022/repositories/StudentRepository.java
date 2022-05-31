package com.aclabs.aclabs2022.repositories;

import com.aclabs.aclabs2022.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
}