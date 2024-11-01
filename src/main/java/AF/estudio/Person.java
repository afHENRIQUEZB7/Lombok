package AF.estudio;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Integer age;
    private Integer phoneNumbre;
    private LocalDate dateOfBirth;
}
