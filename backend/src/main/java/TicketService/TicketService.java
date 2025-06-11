package TicketService;

import com.itsupport.backend.dtos.TicketDto;
import com.itsupport.backend.repository.TicketRepository;
import com.itsupport.backend.mappers.Tickmapper;
import com.itsupport.backend.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public TicketDto EditTicket(Long id, TicketDto ticketDto) {
        return ticketRepository.findById(id)
                .map(existingTicket -> {

                    existingTicket.setNom(ticketDto.getNom());
                    existingTicket.setDescription(ticketDto.getDescription());

                    Ticket updatedTicket = ticketRepository.save(existingTicket);
                    return tickmapper.toDTO(updatedTicket);
                })
                .orElse(null);
    }
    public void deleteticket(Long id) {
        ticketRepository.deleteById(id);
    }
}
