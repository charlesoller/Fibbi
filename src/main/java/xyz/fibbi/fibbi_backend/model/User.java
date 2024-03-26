package xyz.fibbi.fibbi_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String first_name;

    private String last_name;
    public User(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

}
