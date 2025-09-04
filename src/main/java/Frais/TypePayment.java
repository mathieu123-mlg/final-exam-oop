package Frais;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
@EqualsAndHashCode
public class TypePayment {
    private final int id;
    private final double montant_a_payer;
    private final Instant dateHeure;

    public TypePayment(int id, double montant_a_payer) {
        this.id = id;
        this.montant_a_payer = montant_a_payer;
        this.dateHeure = Instant.now();
    }
}
