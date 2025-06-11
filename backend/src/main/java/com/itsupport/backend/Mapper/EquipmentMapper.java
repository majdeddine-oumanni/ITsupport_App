package com.itsupport.backend.Mapper;

import com.itsupport.backend.dtos.TicketDto;
import com.itsupport.backend.model.Ticket;
import org.mapstruct.Mapper;

import java.util.List;

public interface EquipmentMapper {
    @Mapper(componentModel = "spring")
    interface Tickmapper {

        static Ticket toEntity(TicketDto ticketDto) {
            return null;
        }

        TicketDto toDTO(Ticket ticket);
        List<TicketDto> toDTOs (List<Ticket> tickets);

    }
}
