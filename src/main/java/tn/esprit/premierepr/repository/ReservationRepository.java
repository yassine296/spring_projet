package tn.esprit.premierepr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.premierepr.domain.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
