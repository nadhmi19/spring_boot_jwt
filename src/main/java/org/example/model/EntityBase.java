package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
public abstract class EntityBase {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "created_on")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    public EntityBase(){
        this.createdOn = new Date();
    }


}
