package tacos.security;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import tacos.bean.User;

@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String street;
    private String city;
    private String province;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                username, passwordEncoder.encode(password),
                street, city, province, zip, phone
        );
    }
}
