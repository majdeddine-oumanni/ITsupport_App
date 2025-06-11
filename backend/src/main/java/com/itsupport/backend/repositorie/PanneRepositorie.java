package com.itsupport.backend.repositorie;

import com.itsupport.backend.entities.Panne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanneRepositorie extends JpaRepository<Panne,Long> {
}
