package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "CURSURI")
@Access(value = AccessType.FIELD)
public class Cursuri {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cursuri_seq")
    @SequenceGenerator(name = "cursuri_seq", sequenceName = "CURSURI_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NUME", nullable = false)
    private String nume;

    protected Cursuri() {

    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
