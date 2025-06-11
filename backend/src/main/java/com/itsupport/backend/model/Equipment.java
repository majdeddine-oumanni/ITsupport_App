package com.itsupport.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eq_id;
    private String name;
    private String type;
    private String status;
    private Date purchase_date;



}
