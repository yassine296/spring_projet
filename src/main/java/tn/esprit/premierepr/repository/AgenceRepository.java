package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Agence;

@Repository
public interface AgenceRepository extends JpaRepository <Agence, Long> {

}