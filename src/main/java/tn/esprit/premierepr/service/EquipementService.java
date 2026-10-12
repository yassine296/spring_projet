package tn.esprit.premierepr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.premierepr.domain.Equipement;
import tn.esprit.premierepr.repository.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return equipementRepository.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return equipementRepository.saveAll(equipements);
    }
}
