package com.prodemy.boot.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_profile")
public class Profile {
    @Id
    @Column("PROFILEID")
    private Long id; 

    @Column("EMAIL")
    private String email;

    @Column("FIRST_NAME")
    private String firstName;

    @Column("LAST_NAME")
    private String lastName;

    @Column("PROFILE_IMAGE")
    private String profileImage;

    
}
