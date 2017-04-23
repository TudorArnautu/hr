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

    @Column(name = "NUME_CURS", nullable = false)
    private String numeCurs;

    protected Cursuri() {

    }

    public int getId() {
        return id;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeCurs(String nume) {
        this.numeCurs = nume;
    }
}
