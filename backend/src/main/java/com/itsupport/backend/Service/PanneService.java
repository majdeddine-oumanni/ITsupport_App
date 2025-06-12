package com.itsupport.backend.Service;

import com.itsupport.backend.dtos.PanneDto;
import com.itsupport.backend.Mapper.PanneMap;
import com.itsupport.backend.model.Panne;
import com.itsupport.backend.model.Ticket;
import com.itsupport.backend.repository.PanneRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanneService {
    private final PanneRepositorie panneRepositorie;
    private final PanneMap panneMap;

    public PanneService(PanneRepositorie panneRepositorie, PanneMap panneMap) {
        this.panneRepositorie = panneRepositorie;
        this.panneMap = panneMap;
    }

    public PanneDto addPan(PanneDto panneDto) {
        Panne panne = panneMap.toEntity(panneDto);
        Panne savedPanne = panneRepositorie.save(panne);
        return panneMap.toDto(savedPanne);
    }

    public List<PanneDto> getAllPans() {
        List<Panne> pannes = panneRepositorie.findAll();
        return panneMap.toDtos(pannes);
    }

    public PanneDto getPanById(Long id){
        return panneRepositorie.findById(id)
                .map(panneMap ::toDto)
                .orElse(null);
    }

    public PanneDto update(Long id, PanneDto panneDto){
        return panneRepositorie.findById(id)
                .map(existingPanne -> {

                    existingPanne .setIdEquip(panneDto.getIdEquip());

                    Panne updatedPanne = panneRepositorie.save(existingPanne);
                    return panneMap.toDto(updatedPanne);
                })
                .orElse(null);
    }

    public void deletePan(Long id){
        panneRepositorie.deleteById(id);

    }
}
