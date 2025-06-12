package com.itsupport.backend.Service;

import com.itsupport.backend.dtos.EquipmentDto;
import com.itsupport.backend.mappers.EquipmentMapper;
import com.itsupport.backend.model.Equipment;
import com.itsupport.backend.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final EquipmentMapper equipmentMapper;

    public EquipmentService(EquipmentRepository equipmentRepository, EquipmentMapper equipmentMapper) {
        this.equipmentRepository = equipmentRepository;
        this.equipmentMapper = equipmentMapper;
    }

    public EquipmentDto save(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentMapper.toModel(equipmentDto);
        Equipment saved = equipmentRepository.save(equipment);
        return equipmentMapper.toDto(saved);
    }
    public List<EquipmentDto> getAllEquipment() {
        List<Equipment> equipments = equipmentRepository.findAll();
        return equipmentMapper.toDtos(equipments);
    }
    public EquipmentDto updateEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentMapper.toModel(equipmentDto);
        Equipment saved = equipmentRepository.save(equipment);
        return equipmentMapper.toDto(saved);
    }
    public void deleteEquipment(Long id){
        equipmentRepository.deleteById(id);
    }
}
