package Frais;

import java.time.Instant;
import java.util.List;

public class Statistics {
    public static List<Frais> getLateFees(List<Frais> frais, Instant t) {
        return frais.stream()
                .filter(frais::contains)
                .filter(
                        vola -> vola.statusFrais().equals(Status.LATE)
                                && vola.getDateHeure().equals(t)
                )
                .toList();
    }

    public static double getTotalMissingFees(List<Frais> frais, Instant t) {
        return (double) (frais.stream()
                .filter(frais::contains)
                .filter(
                        vola -> vola.statusFrais().equals(Status.IN_PROGRESS)
                                && vola.getDateHeure().equals(t)
                )
                .count());
    }

    public static double getTotalPaidByStudent(Etudiant etudiant, List<Frais> frais, Instant t) {
        return (double) etudiant.getHistoriqueFrais().stream()
                .filter(frais::contains)
                .filter(vola -> vola.getDateHeure().equals(t))
                .count();
    }
}
