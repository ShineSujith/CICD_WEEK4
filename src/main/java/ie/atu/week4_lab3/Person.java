package ie.atu.week4_lab3;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "id can not be Null")
    private int id;
    @Min(value = 0, message = "age must be greater than 0")
    private int age;
}
