package com.example.LearningApp.repository;

import com.example.LearningApp.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
