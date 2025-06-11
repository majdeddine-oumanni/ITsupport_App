package com.itsupport.backend.Controller;

import com.itsupport.backend.dtos.PanneDto;
import com.itsupport.backend.Service.PanneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PanneController {
    private final PanneService panneService;

    public PanneController(PanneService panneService) {
        this.panneService = panneService;
    }
    @PostMapping
    public ResponseEntity<PanneDto> addPan (@RequestBody PanneDto panneDto){
        PanneDto savedPan = panneService.addPan(panneDto);
        return new ResponseEntity<>(savedPan, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity <PanneDto> getPanById(@PathVariable Long id){
        PanneDto panneDto = panneService.getPanById(id);
        return panneDto !=null
                ? new ResponseEntity<>(panneDto, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @DeleteMapping
    public ResponseEntity<Void> deletPan(@PathVariable Long id){
        panneService.deletePan(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
