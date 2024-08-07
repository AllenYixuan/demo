package com.Practice.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
/* Bean放在容器中*/

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByEmail(String email);
}
