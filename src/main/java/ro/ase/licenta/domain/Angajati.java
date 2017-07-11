package ro.ase.licenta.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "ANGAJATI")
@Access(value = AccessType.FIELD)
public class Angajati implements Serializable{

    private static final int serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ang_seq")
    @SequenceGenerator(name = "ang_seq", sequenceName = "ANGAJATI_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NUME", nullable = false)
    private String nume;

    @Column(name = "PRENUME", nullable = false)
    private String prenume;

    @Column(name = "ID_FUNCTIE", nullable = false)
    private int idFunctie;

    protected Angajati() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setId_functie(int id_angajat) {
        this.idFunctie = id_angajat;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getIdFunctie() {
        return idFunctie;
    }
}
