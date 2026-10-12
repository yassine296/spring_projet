package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {

}
