package tn.esprit.premierepr.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

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
    @Column(nullable = false, unique = true, length = 20)
    private String nom;
    @Column(nullable = false, unique = true, length = 20)
    private String ville;
    @Column(nullable = false, unique = true, length = 20)
    private String adresse;
    @Column(nullable = false, unique = true, length = 20)
    private String telephone;
}
