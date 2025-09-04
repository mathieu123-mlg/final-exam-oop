package Frais;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class EtudiantTest {
    private Groupe groupeK1;
    private Groupe groupeK2;
    private Groupe groupeK3;
    private Groupe groupeK4;
    private Groupe groupeK5;

    private Frais frais;

    private Etudiant etudiant;

    @BeforeEach
    public void variableInitial() {
        Groupe groupeK2 = new Groupe(1, "K2");
        Groupe groupeK3 = new Groupe(1, "K3");
        Groupe groupeK4 = new Groupe(1, "K4");
        Groupe groupeK1 = new Groupe(1, "K1");
        Etudiant etudiant = new Etudiant(
                1,
                "RAKOTOARISOA",
                "Mathieu",
                Instant.parse("2025-10-18T00:00:00Z"),
                groupeK2
        );
        Frais frais = new Frais(
                1,
                4000,
                "Cotisation",
                4_000,
                Instant.parse("2025-09-10T08:00:00Z")
        );
    }
    @Test
    public void FraisTest(){
        Assertions.assertEquals(Status.PAID, frais.statusFrais(), "Montant payer");
    }
}
