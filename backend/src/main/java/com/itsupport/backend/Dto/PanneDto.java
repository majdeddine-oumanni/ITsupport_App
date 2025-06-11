package com.itsupport.backend.Dto;

public class PanneDto {
    private Long id;
    private Long idEquip;

    public PanneDto(Long id, Long idEquip) {
        this.id = id;
        this.idEquip = idEquip;
    }

    public PanneDto() {
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
