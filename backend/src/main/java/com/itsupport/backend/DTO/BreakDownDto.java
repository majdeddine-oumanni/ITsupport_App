package com.itsupport.backend.DTO;

import com.itsupport.backend.model.Equipment;
import com.itsupport.backend.model.SupportTicket;

public class BreakDownDto {
    private Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public SupportTicket getTicket() {
        return ticket;
    }

    public void setTicket(SupportTicket ticket) {
        this.ticket = ticket;
    }

    private SupportTicket ticket;
}
