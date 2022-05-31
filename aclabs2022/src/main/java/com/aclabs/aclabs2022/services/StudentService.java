package com.aclabs.aclabs2022.services;

import com.aclabs.aclabs2022.exceptions.StudentNotFoundException;
import com.aclabs.aclabs2022.model.Student;
import com.aclabs.aclabs2022.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student updatedStudent) {
        studentRepository.save(updatedStudent);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public void studentExists(String id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Exception: Student was not found!");
        }
    }
}