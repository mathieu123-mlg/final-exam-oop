package Frais;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class Frais {
    private int id;
    private int label;
    private double montant_payer;
    private Instant deadline;
}
