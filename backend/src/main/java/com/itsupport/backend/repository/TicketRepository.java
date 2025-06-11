package com.itsupport.backend.ticketrepository;

import com.itsupport.backend.tickmodel.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
