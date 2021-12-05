package com.umss.dev.CoursesManagement.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Instructor;

@Repository

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

	 @Query(nativeQuery = true,value = "call cursos_instructor_")  
	    List<Map<String, Object>> cursosInstructor();

	Optional<Instructor> findByEmail(String email);
	Boolean existsByEmail(String email);	
}
