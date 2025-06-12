package com.itsupport.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDto {


    private Long eq_id;
    private String name;
    private String type;
    private String status;
    private Date purchase_date;
}
