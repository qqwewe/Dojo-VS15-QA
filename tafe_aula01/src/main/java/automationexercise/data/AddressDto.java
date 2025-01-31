package automationexercise.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneHome;
    private String phoneMobile;

}
