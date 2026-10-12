package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
