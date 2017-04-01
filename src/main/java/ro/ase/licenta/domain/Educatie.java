package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "EDUCATIE")
@Access(value = AccessType.FIELD)
public class Educatie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "educatie_seq")
    @SequenceGenerator(name = "educatie_seq", sequenceName = "EDUCATIE_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "DESCRIERE", nullable = false)
    private String descriere;

    @Column(name = "ID_CV", nullable = false)
    private int idCv;

    @Column(name = "AN_ABSOLVIRE", nullable = false)
    private int anAbsolvire;

    @Column(name = "FACULTATE", nullable = false)
    private String facultate;

    @Column(name = "ANI_FACULTATE", nullable = false)
    private int aniFacultate;

    protected Educatie() {

    }

    public int getId() {
        return id;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getIdCv() {
        return idCv;
    }

    public int getAnAbsolvire() {
        return anAbsolvire;
    }

    public String getFacultate() {
        return facultate;
    }

    public int getAniFacultate() {
        return aniFacultate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setIdCv(int idCv) {
        this.idCv = idCv;
    }

    public void setAnAbsolvire(int anAbsolvire) {
        this.anAbsolvire = anAbsolvire;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAniFacultate(int aniFacultate) {
        this.aniFacultate = aniFacultate;
    }
}
