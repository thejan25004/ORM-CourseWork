package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int userId ;

    @Column(nullable = false, unique = true)
    private String userName ;
    private String Password ;

    public User(String userName, String password) {
        this.userName = userName;
        Password = password;
    }
}
