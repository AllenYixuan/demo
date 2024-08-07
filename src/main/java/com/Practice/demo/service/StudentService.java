package com.Practice.demo.service;

import com.Practice.demo.dao.Student;
import com.Practice.demo.dto.StudentDTO;

public interface StudentService {
     StudentDTO getStudentById(long id);

     Long addNewStudent(StudentDTO studentDTO);

     void deleletStudentById(long id);

     StudentDTO updateStudentById(long id, String name, String email);

}
