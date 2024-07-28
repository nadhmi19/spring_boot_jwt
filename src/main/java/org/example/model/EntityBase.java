package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.Date;

@MappedSuperclass
@Getter
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
