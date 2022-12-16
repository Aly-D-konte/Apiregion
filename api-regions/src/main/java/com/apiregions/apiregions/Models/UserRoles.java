package com.apiregions.apiregions.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id;
   private String roleName;

    public UserRoles(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
}
