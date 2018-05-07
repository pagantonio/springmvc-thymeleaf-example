package br.com.incubadoras2it.springmvctutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by PEDRO on 07/05/2018.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
