package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "DEPARTAMENTE")
@Access(value = AccessType.FIELD)
public class Departamente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departamente_seq")
    @SequenceGenerator(name = "departamente_seq", sequenceName = "DEPARTAMENTE_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NUME", nullable = false)
    private String nume;

    protected Departamente() {

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
