package tn.esprit.premierepr.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateSignature;
    @Column(nullable = false, unique = true, length = 20)
    private long montantTotal;
    @Column(nullable = false, length = 20)
    private boolean valide;
}
