package tn.esprit.premierepr.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(nullable = false, unique = true, length = 20)
    private String nom;
    @Column(nullable = false, unique = true, length = 20)
    private String prenom;
    @Column(nullable = false, unique = true, length = 20)
    private String adresse;
    @Column(nullable = false, unique = true, length = 20)
    private String telephone;
    @Column(nullable = false, unique = true, length = 20)
    private long numPermis;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateInscription;
}
