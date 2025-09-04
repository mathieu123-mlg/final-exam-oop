package Frais;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateEnter;
    private List<Groupe> historiqueGroupe;
}
