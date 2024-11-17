package com.management.ManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "person_type")
public class Person {

    @Id
    private long id;

    @Column(name = "full_name")
    @NotNull
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    @NotNull
    private String password;

}
