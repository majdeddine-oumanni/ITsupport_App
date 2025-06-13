package com.itsupport.backend.mappers;

import com.itsupport.backend.DTO.BreakDownDto;
import com.itsupport.backend.model.BreakDown;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BreakDownMapper {
    BreakDown toEntity(BreakDownDto dto);
    BreakDownDto toDTO(BreakDown breakDown);
    List<BreakDownDto> toDTOs(List<BreakDown> breakDownList);
}
