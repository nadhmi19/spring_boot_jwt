package org.example.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.utils.enums.ERole;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
@Getter
@Setter
@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)

public class Role extends EntityBase {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "users_in_roles",
            joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") } )
    private Set<User> users = new HashSet<>();

}
