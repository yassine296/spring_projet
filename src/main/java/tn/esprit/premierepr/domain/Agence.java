package tn.esprit.premierepr.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 100)
    private String adresse;

    @Column(nullable = false, length = 20)
    private String telephone;

    // 1 Agence -> * Vehicules
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;

    // 1 Agence -> * Employes
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;
}
