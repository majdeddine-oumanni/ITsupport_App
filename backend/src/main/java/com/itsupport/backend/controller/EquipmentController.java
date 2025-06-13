package com.itsupport.backend.controller;

import com.itsupport.backend.DTO.EquipmentDto;
import com.itsupport.backend.Service.EquipmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    private final EquipmentService service;

    public EquipmentController(EquipmentService service) {
        this.service = service;
    }
    @GetMapping("/getAll")
    public List<EquipmentDto> getAllEquipment(){
        return service.findAllEquipment();
    }

    @PostMapping("/add")
    public EquipmentDto save(EquipmentDto dto){
        return service.saveEquipment(dto);
    }

    @PutMapping("/update/{id}")
    public EquipmentDto update(@RequestBody EquipmentDto dto, @PathVariable Long id){
        return service.updateEquipment(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.deleteEquipment(id);
    }

    @GetMapping("/getEquipment/{id}")
    public EquipmentDto getEquipment(@PathVariable Long id){
        return service.findEquipmentById(id);
    }
}
