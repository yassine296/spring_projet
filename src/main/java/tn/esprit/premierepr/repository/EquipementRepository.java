package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}
