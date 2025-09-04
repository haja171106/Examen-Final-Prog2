package note;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Note {
    private int valeur;
    private Instant dateDeNote;
}
