package com.itsupport.backend.tickmapper;


import com.itsupport.backend.tickdto.TicketDto;
import com.itsupport.backend.tickmodel.Ticket;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface Tickmapper {

    static Ticket toEntity(TicketDto ticketDto) {
        return null;
    }

    TicketDto toDTO(Ticket ticket);
    List<TicketDto> toDTOs (List<Ticket> tickets);

}
