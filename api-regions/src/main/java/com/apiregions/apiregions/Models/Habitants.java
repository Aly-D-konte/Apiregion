package com.apiregions.apiregions.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habitants;
    private String annee;
    private String nbre_population;


/* La liaison entre habitant et la region
//@JsonIgnore*/
    @JsonIgnore
  @ManyToOne
  public Regions regions;


}
