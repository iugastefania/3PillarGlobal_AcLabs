package com.aclabs.aclabs2022.controllers;

import com.aclabs.aclabs2022.model.Student;
import com.aclabs.aclabs2022.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService homeService;

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(homeService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Object> addStudent(@RequestBody Student student) {
        homeService.addStudent(student);
        return new ResponseEntity<>("Student with id: " + student.getId() + " was created.", HttpStatus.OK);
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<Object> updateStudent(@RequestBody Student updatedStudent) {
        homeService.studentExists(updatedStudent.getId());
        homeService.updateStudent(updatedStudent);
        return new ResponseEntity<>("Student with id: " + updatedStudent.getId() + " was updated.", HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable String id) {
        homeService.studentExists(id);
        homeService.deleteStudent(id);
        return new ResponseEntity<>("Student with id: " + id + " was deleted.", HttpStatus.OK);
    }
}