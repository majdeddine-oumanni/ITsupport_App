package com.itsupport.backend.Service;

import com.itsupport.backend.DTO.EquipmentDto;
import com.itsupport.backend.mappers.EquipmentMapper;
import com.itsupport.backend.model.Equipment;
import com.itsupport.backend.repositories.EquipmentRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public List<EquipmentDto> findAllEquipment() {
        List<Equipment> equipments = repository.findAll();
        return mapper.toDTOs(equipments);
    }


    public EquipmentDto updateEquipment(EquipmentDto dto, Long id) {
        Equipment foundEquipment = repository.findById(id).
                orElseThrow(()-> new EntityNotFoundException("equipment not found"));
        foundEquipment.setName(dto.getName());
        foundEquipment.setPurchase_date(dto.getPurchase_date());
        foundEquipment.setStatus(dto.getStatus());
        foundEquipment.setType(dto.getType());
        Equipment savedEquipment = repository.save(foundEquipment);
        return mapper.toDTO(savedEquipment);
    }


    public EquipmentDto findEquipmentById(Long id){
        Equipment foundEquipment = repository.findById(id).
                orElseThrow(()-> new EntityNotFoundException("equipment not found"));
        return mapper.toDTO(foundEquipment);
    }


    public void deleteEquipment(Long id){
        repository.deleteById(id);
    }
}
