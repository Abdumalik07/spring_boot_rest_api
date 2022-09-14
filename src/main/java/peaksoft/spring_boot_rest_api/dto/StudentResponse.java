package peaksoft.spring_boot_rest_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {
    private Long id;
    private String name;
    private int age;
    private boolean isDeleted;
    private boolean isActive;
}
