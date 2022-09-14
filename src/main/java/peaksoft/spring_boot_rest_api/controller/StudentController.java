package peaksoft.spring_boot_rest_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.spring_boot_rest_api.dto.StudentRequest;
import peaksoft.spring_boot_rest_api.dto.StudentResponse;
import peaksoft.spring_boot_rest_api.entity.Student;
import peaksoft.spring_boot_rest_api.service.StudentService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService service;

//  For student request
//    @PostMapping
//    public Student create(@RequestBody StudentRequest student){
//        return service.addStudent2(student);
//    }

    // For student response
    @PostMapping
    public StudentResponse create(@RequestBody StudentRequest student){
        return service.addStudent2(student);
    }

}
