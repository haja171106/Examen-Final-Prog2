package note;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Cours {
    private int id;
    private String label;
    private int credit;
    private Enseignant enseignant;

}
