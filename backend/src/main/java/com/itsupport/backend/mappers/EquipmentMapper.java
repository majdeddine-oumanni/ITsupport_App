package com.itsupport.backend.mappers;

import com.itsupport.backend.dtos.EquipmentDto;
import com.itsupport.backend.model.Equipment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {

    Equipment toModel(EquipmentDto dto);
    EquipmentDto toDto(Equipment equipment);
    List<EquipmentDto> toDtos(List<Equipment> equipments);
}
