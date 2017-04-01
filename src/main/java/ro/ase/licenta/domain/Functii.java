package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "FUNCTII")
@Access(value = AccessType.FIELD)
public class Functii {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "functii_seq")
    @SequenceGenerator(name = "functii_seq", sequenceName = "FUNCTII_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NUME_FUNCTIE", nullable = false)
    private String numeFunctie;

    @Column(name = "SALARIU", nullable = false)
    private int salariu;

    @Column(name = "ID_DEPARTAMENT", nullable = false)
    private int idDepartament;

    protected Functii() {

    }

    public int getId() {
        return id;
    }

    public String getNumeFunctie() {
        return numeFunctie;
    }

    public int getSalariu() {
        return salariu;
    }

    public int getIdDepartament() {
        return idDepartament;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeFunctie(String numeFunctie) {
        this.numeFunctie = numeFunctie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public void setIdDepartament(int idDepartament) {
        this.idDepartament = idDepartament;
    }
}
