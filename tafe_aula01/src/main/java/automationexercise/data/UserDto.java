package automationexercise.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDto {

    private String email;
    private String title;
    private String firstName;
    private String lastName;
    private String password;
    private Integer day;
    private Integer month;
    private Integer year;


}
