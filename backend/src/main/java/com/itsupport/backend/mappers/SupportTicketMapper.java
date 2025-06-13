package com.itsupport.backend.mappers;

import com.itsupport.backend.DTO.SupportTicketDto;
import com.itsupport.backend.model.SupportTicket;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupportTicketMapper {
    SupportTicket toEntity(SupportTicketDto dto);
    SupportTicketDto toDTO(SupportTicket supportTicket);
    List<SupportTicketDto> toDTOs(List<SupportTicket> supportTicketList);
}
