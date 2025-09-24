package com.datajpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	/* custom quries */
	
	@Query("Selct s from student s where s.phone:stuPhone")
	public List<Student> getStudentbyPhone(Long StuPhone);
	
	
	
	
}
