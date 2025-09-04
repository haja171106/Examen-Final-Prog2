package note;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.util.List;

public class ExamenTest {
    @BeforeEach
    public void setUp() {
        Examen examen;
        Etudiant etudiant;
        Enseignant enseignant;
        Cours cours;

        enseignant = new Enseignant(1, "Toky", "dr", Instant.parse("1980-01-01T00:00:00Z"), "toky@mail.hei.school", "0340000000", "back-end");
        cours = new Cours(1, "prog 2", 5, enseignant);
        examen = new Examen(1, "prog 2", cours, Instant.parse("2023-06-01T10:00:00Z"), 2, List.of());
        etudiant = new Etudiant(1, "haja", "rvh", Instant.parse("2000-01-01T00:00:00Z"), "rvh@gmail.com", "0123456789", "k4", null);


    }
    @Test
    public void testGetExamGrade() {
        assertEquals(0, 0);
    }

    @Test
    public void testGetCourseGrade() {
    }
}