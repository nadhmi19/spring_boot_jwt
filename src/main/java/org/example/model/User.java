package org.example.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users",
uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})
@Getter
@Setter
@AllArgsConstructor
public class User extends EntityBase{


    @NotBlank
    @Size(max = 20)
    @Column(name="username",length = 255)
    private String username;


    @Column(name="first_name",length = 255)
    private String firstName;

    @Column(name="last_name",length = 255)
    private String lastName;

    @NotBlank
    @Size(max = 50)
    @Column(name="email",length = 255)
    private String email;


    @Size(max = 120)
    @Column(nullable = true)
    private String password;

    @Column(name = "passwordHash", length = 512)
    private String passwordHash;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(name = "users_in_roles",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") } )
    private Set<Role> roles = new HashSet<>();
    public User(String username,String email,String passwordHash)
    {
        this.username=username;
        this.email=email;
        this.passwordHash=passwordHash;
    }

    public User() {

    }
}
