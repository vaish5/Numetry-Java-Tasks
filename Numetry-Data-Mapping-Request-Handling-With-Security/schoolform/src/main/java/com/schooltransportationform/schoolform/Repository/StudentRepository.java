package com.schooltransportationform.schoolform.Repository;

import com.schooltransportationform.schoolform.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
