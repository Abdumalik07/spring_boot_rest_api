package peaksoft.spring_boot_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.spring_boot_rest_api.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}