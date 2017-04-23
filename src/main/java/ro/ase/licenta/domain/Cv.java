package ro.ase.licenta.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "CV")
@Access(value = AccessType.FIELD)
public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cv_seq")
    @SequenceGenerator(name = "cv_seq", sequenceName = "CV_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "ADRESA", nullable = false)
    private String adresa;

    @Column(name = "TELEFON", nullable = false)
    private int telefon;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "NATIONALITATE", nullable = false)
    private String nationalitate;

    @Column(name = "DATA_NASTERE", nullable = false)
    private String dataNastere;

    @Column(name = "SEX", nullable = false)
    private String sex;

    @Column(name = "ORAS", nullable = false)
    private String oras;

    @Column(name = "TARA", nullable = false)
    private String tara;

    @Column(name = "NUME", nullable = false)
    private String nume;

    @Column(name = "PRENUME", nullable = false)
    private String prenume;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    protected Cv() {

    }

    public int getId() {
        return id;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public String getSex() {
        return sex;
    }

    public String getOras() {
        return oras;
    }

    public String getTara() {
        return tara;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}
