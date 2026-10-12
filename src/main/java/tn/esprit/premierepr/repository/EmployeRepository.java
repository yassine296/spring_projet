package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
