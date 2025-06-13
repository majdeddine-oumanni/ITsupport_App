package com.itsupport.backend.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long ticket_id ;
    private  String title;
    private  String status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @OneToOne(mappedBy = "ticket")
    private BreakDown breakDownList;

    @ManyToOne
    private User user;

    public Long getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Long ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public BreakDown getBreakDownList() {
        return breakDownList;
    }

    public void setBreakDownList(BreakDown breakDownList) {
        this.breakDownList = breakDownList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
