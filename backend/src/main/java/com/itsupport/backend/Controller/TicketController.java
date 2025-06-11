package com.itsupport.backend.Controller;

import TicketService.TicketService;
import com.itsupport.backend.dtos.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping
@RestController
public class TicketController {

private final TicketService ticketService;
@Autowired

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    @GetMapping("/Tickets")
    public ResponseEntity<List<TicketDto>> getAllTickets() {
        List<TicketDto> ticketDtos = ticketService.getAllTickets();
        return new ResponseEntity<>(ticketDtos, HttpStatus.OK);
    }
    @PostMapping("/Tickets")
    public ResponseEntity<TicketDto> addTicket(@RequestBody TicketDto ticketDto) {
        TicketDto savedTicket = ticketService.addTick(ticketDto);
        return new ResponseEntity<>(savedTicket, HttpStatus.CREATED);
    }
    @GetMapping("/Ticket/ {id}")
    public ResponseEntity<TicketDto> getTicketById(@PathVariable Long id) {
        TicketDto ticketDto = ticketService.getTickettById(id);
        return ticketDto != null
                ? new ResponseEntity<>(ticketDto, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/Ticket/{id}")
    public ResponseEntity<TicketDto> updaticket(
            @PathVariable Long id,
            @RequestBody TicketDto ticketDto) {
        TicketDto updatedticket = ticketService.EditTicket(id, ticketDto);
        return updatedticket != null
                ? new ResponseEntity<>(updatedticket, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/Ticket/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable Long id) {
        ticketService.deleteticket(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
