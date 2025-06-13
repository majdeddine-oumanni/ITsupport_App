package com.itsupport.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.swing.text.StyleContext;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User{
    @OneToMany(mappedBy = "admin")
    List<BreakDown> breakDownList;

    public List<BreakDown> getBreakDownList() {
        return breakDownList;
    }

    public void setBreakDownList(List<BreakDown> breakDownList) {
        this.breakDownList = breakDownList;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @OneToMany(mappedBy = "admin")
    List<Equipment> equipmentList;

}
