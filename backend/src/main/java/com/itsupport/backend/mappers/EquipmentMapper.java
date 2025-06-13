package com.itsupport.backend.mappers;

import com.itsupport.backend.DTO.EquipmentDto;
import com.itsupport.backend.model.Equipment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {
    Equipment toEntity(EquipmentDto dto);
    EquipmentDto toDTO(Equipment equipment);
    List<EquipmentDto> toDTOs(List<Equipment> equipments);
}
