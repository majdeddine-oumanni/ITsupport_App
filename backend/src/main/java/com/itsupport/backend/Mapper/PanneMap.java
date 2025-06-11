package com.itsupport.backend.Mapper;

import com.itsupport.backend.Dto.PanneDto;
import com.itsupport.backend.entities.Panne;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PanneMap {
    Panne toEntity(PanneDto panneDto);
    PanneDto toDto(Panne panne);
    List<PanneDto> toDtos(List<Panne> pannes);
}
