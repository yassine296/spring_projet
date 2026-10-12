package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    Reservation retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
    List<Reservation> addReservations(List<Reservation> reservations);
}
