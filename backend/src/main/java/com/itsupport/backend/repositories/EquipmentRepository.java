package com.itsupport.backend.repositories;

import com.itsupport.backend.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    Equipment findByEq_id(Long id);
}
