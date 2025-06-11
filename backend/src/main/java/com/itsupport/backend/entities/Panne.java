package com.itsupport.backend.entities;

import jakarta.persistence.*;

@Entity
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private Long idEquip;

    public Panne(Long id, Long idEquip) {
        this.id = id;
        this.idEquip = idEquip;
    }

    public Panne() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(Long idEquip) {
        this.idEquip = idEquip;
    }
}
