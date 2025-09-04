package note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Enseignant {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateNaissance;
    private String email;
    private String telephone;
    private String specialite;
}
