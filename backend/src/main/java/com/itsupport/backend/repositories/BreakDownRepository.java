package com.itsupport.backend.repositories;

import com.itsupport.backend.model.BreakDown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreakDownRepository extends JpaRepository<BreakDown, Long> {
    BreakDown findBreakDownById(Long id);
}
