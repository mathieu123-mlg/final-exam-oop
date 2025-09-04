package Frais;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TypePayment {
    private int id;
    private double montant_payer;
    private Instant dateHeure = Instant.now();
}
