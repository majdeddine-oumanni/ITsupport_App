package com.itsupport.backend.tickmodel;

import com.itsupport.backend.tickdto.TicketDto;
import com.itsupport.backend.ticketrepository.TicketRepository;
import com.itsupport.backend.tickmapper.Tickmapper;

import java.util.List;

public class TicketService {

private final TicketRepository ticketRepository;

private final Tickmapper tickmapper;


    public TicketService(TicketRepository ticketRepository, Tickmapper tickmapper) {
        this.ticketRepository = ticketRepository;
        this.tickmapper = tickmapper;
    }

    public TicketDto addTick(TicketDto ticketDto) {
        Ticket ticket = Tickmapper.toEntity(ticketDto);
        Ticket savedticket = ticketRepository.save(ticket);
        return tickmapper.toDTO(savedticket);
    }
    public List<TicketDto> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickmapper.toDTOs(tickets);
    }
    public TicketDto getTickettById(Long id) {
        return ticketRepository.findById(id)
                .map(tickmapper::toDTO)
                .orElse(null);
    }
}
