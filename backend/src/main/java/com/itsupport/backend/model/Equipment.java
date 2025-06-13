package com.itsupport.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eq_id;
    private String name;
    private String type;
    private String status;
    private LocalDate purchase_date;

    public Long getEq_id() {
        return eq_id;
    }

    public void setEq_id(Long eq_id) {
        this.eq_id = eq_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDate purchase_date) {
        this.purchase_date = purchase_date;
    }

    public List<BreakDown> getBreakDownList() {
        return breakDownList;
    }

    public void setBreakDownList(List<BreakDown> breakDownList) {
        this.breakDownList = breakDownList;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @OneToMany(mappedBy = "equipment")
    List<BreakDown> breakDownList;

    @ManyToOne
    private Admin admin;

}
