package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {

}