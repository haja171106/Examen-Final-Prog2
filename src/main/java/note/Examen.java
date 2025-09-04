package note;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Examen {
    private int id;
    private String titre;
    private Cours cours;
    private Instant dateDExamen;
    private int coefficient;
    private List<Note> notes;

    public double getNotes(Instant t) {
        return notes.stream()
                .filter(notes -> notes.getDateDeNote().isBefore(t))
                .max(Comparator.comparing(Note::getDateDeNote))
                .map(Note::getValeur)
                .get();

    }
}
