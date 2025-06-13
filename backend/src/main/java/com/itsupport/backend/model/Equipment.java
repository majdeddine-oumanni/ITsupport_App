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

public class Equipment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eq_id;
    private String name;
    private String type;
    private String status;
    private Date purchase_date;

    public Equipment() {
    }

    public Equipment(Long eq_id, String name, String type, String status, Date purchase_date) {
        this.eq_id = eq_id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.purchase_date = purchase_date;
    }

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

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }
}
