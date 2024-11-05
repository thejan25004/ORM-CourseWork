package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int userId;
    private String userName;
    private String password;


    public UserDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
}
