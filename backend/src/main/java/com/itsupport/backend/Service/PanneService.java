package com.itsupport.backend.Service;

import com.itsupport.backend.Dto.PanneDto;
import com.itsupport.backend.Mapper.PanneMap;
import com.itsupport.backend.entities.Panne;
import com.itsupport.backend.repositorie.PanneRepositorie;
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

    public void deletePan(Long id){
        panneRepositorie.deleteById(id);

    }
}
