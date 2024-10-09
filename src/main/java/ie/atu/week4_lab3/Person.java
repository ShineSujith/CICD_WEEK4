package ie.atu.week4_lab3;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name can not be blank")
    private String name;
    @NotBlank(message = "Title can not be blank")
    private String title;
    @Email(message = "Email is invalid")
    private String email;
    @NotBlank(message = "Position can not be blank")
    private String position;
    @NotBlank(message = "Department can not be blank")
    private String department;
    @PositiveOrZero(message = "id is invalid")
    private int id;
    @Min(value = 18, message = "age must be greater than 18")
    private int age;
}
