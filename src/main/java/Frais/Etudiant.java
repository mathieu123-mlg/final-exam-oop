package Frais;

import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Etudiant {
    private final int id;
    private final String nom;
    private final String prenom;
    private final Instant dateEnter;
    private Groupe groupe;
    private final List<Groupe> historiqueGroupe =  new ArrayList<>();
    private final List<Frais> historiqueFrais =  new ArrayList<>();

    public Etudiant(int id, String nom, String prenom, Instant dateEnter, Groupe groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEnter = dateEnter;
        this.groupe = groupe;
    }

    public void changerGroupe(Groupe groupe) {
        this.groupe = groupe;
        this.historiqueGroupe.add(groupe);
    }

    public void imposerFrais(Frais frais) {
        this.historiqueFrais.add(frais);
    }
}
