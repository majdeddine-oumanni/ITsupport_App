package com.itsupport.backend.Service;

import com.itsupport.backend.DTO.EquipmentDto;
import com.itsupport.backend.mappers.EquipmentMapper;
import com.itsupport.backend.model.Equipment;
import com.itsupport.backend.repositories.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    private final EquipmentMapper mapper;
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentMapper mapper, EquipmentRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public EquipmentDto saveEquipment(EquipmentDto dto){
        Equipment equipment = mapper.toEntity(dto);
        Equipment savedEquipment = repository.save(equipment);
        return mapper.toDTO(savedEquipment);
    }

    public List<EquipmentDto> getAllEquipment() {
        List<Equipment> equipments = repository.findAll();
        return mapper.toDTOs(equipments);
    }
    public EquipmentDto updateEquipment(EquipmentDto dto, Long id) {
        Equipment foundEquipment = repository.findByEq_id(id);
        foundEquipment.setName(dto.getName());
        foundEquipment.setPurchase_date(dto.getPurchase_date());
        foundEquipment.setStatus(dto.getStatus());
        foundEquipment.setType(dto.getType());

    }

    public void deleteEquipment(Long id){
        repository.deleteById(id);
    }
}
