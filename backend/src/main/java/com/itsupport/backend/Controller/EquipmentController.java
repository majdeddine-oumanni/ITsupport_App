package com.itsupport.backend.Controller;

import com.itsupport.backend.Service.EquipmentService;
import com.itsupport.backend.dtos.EquipmentDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public EquipmentDto createEquipment(@RequestBody EquipmentDto equipmentDto) {
        return equipmentService.save(equipmentDto);

    }

    @GetMapping
    public List<EquipmentDto> getAllEquipment() {
        return equipmentService.getAllEquipment();
    }

    @PutMapping
    public EquipmentDto updateEquipment(@RequestBody EquipmentDto equipmentDto) {
        return equipmentService.updateEquipment(equipmentDto);
    }

    @DeleteMapping
    public void deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteEquipment(id);
    }
}
