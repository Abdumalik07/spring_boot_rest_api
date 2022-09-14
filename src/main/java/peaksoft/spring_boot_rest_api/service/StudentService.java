package peaksoft.spring_boot_rest_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.spring_boot_rest_api.dto.StudentRequest;
import peaksoft.spring_boot_rest_api.dto.StudentResponse;
import peaksoft.spring_boot_rest_api.entity.Student;
import peaksoft.spring_boot_rest_api.repository.StudentRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student addStudent(Student student){
      return repository.save(student);
    }
// for method createStudent
//    public Student addStudent2(StudentRequest request){
//        Student student = createStudent(request);
//        return repository.save(student);
//    }

    //For method response
    public StudentResponse addStudent2(StudentRequest request){
        Student student = createStudent(request);
        return response(repository.save(student));
    }

    public Student createStudent(StudentRequest request){
        Student student = new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        student.setActive(student.isActive());
        student.setDeleted(student.isDeleted());
        student.setCreated(LocalDateTime.now());
        return student;
    }

    public StudentResponse response(Student student){
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setId(student.getId());
        studentResponse.setName(student.getName());
        studentResponse.setAge(student.getAge());
        studentResponse.setActive(student.isActive());
        studentResponse.setDeleted(student.isDeleted());
        return studentResponse;
    }


}
