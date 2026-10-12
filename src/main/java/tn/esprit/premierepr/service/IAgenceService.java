package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Agence;
import java.util.List;

public interface IAgenceService {
    List<Agence> retrieveAllAgences();
    Agence addAgence(Agence a);
    Agence updateAgence(Agence a);
    Agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
    List<Agence> addAgences(List<Agence> agences);
}
