package Frais;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
public class Frais extends TypePayment{
    private final String label;
    private final double montant_payer;
    private final Instant deadline;

    public Frais(int id, double montant_a_payer, String label, double montant_payer, Instant deadline) {
        super(id,  montant_a_payer);
        if (montant_a_payer < 0 ||  montant_payer < 0) {
            throw new IllegalArgumentException("Les montant doit etre positif");
        }
        else {
            this.label = label;
            this.montant_payer = montant_payer;
            this.deadline = deadline;
        }
    }

    public Status statusFrais() {
        if ((Instant.now().isBefore(this.deadline)) && (montant_payer > this.getMontant_a_payer())) {
            return Status.IN_PROGRESS;
        }

        if (montant_payer == this.getMontant_a_payer()) {
            return Status.PAID;
        }

        if ((Instant.now().isAfter(this.deadline)) && (montant_payer < this.getMontant_a_payer())) {
            return Status.LATE;
        }

        if (montant_payer > this.getMontant_a_payer()) {
            return Status.OVERPAID;
        }
        return null;
    }
}
