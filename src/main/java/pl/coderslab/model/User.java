package pl.coderslab.model;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String email;
    private String userName;
    private String password;


    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


}