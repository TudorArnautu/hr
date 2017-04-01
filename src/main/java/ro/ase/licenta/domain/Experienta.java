package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "EXPERIENTA")
@Access(value = AccessType.FIELD)
public class Experienta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experienta_seq")
    @SequenceGenerator(name = "experienta_seq", sequenceName = "EXPERIENTA_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "DESCRIERE", nullable = false)
    private String descriere;

    @Column(name = "ID_CV")
    private int idCv;

    @Column(name = "EXPERIENTA_ANTERIOARA", nullable = false)
    private String experientaAnterioara;

    @Column(name = "ANGAJATOR", nullable = false)
    private String angajator;

    @Column(name = "POZITII_OCUPATE", nullable = false)
    private String pozitiiOcupate;

    @Column(name = "ANI_EXPERIENTA", nullable = false)
    private int aniExperienta;

    @Column(name = "LIMBI_VORBITE", nullable = false)
    private String limbiVorbite;

    protected Experienta() {

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

    public String getExperientaAnterioara() {
        return experientaAnterioara;
    }

    public String getAngajator() {
        return angajator;
    }

    public String getPozitiiOcupate() {
        return pozitiiOcupate;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public String getLimbiVorbite() {
        return limbiVorbite;
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

    public void setExperientaAnterioara(String experientaAnterioara) {
        this.experientaAnterioara = experientaAnterioara;
    }

    public void setAngajator(String angajator) {
        this.angajator = angajator;
    }

    public void setPozitiiOcupate(String pozitiiOcupate) {
        this.pozitiiOcupate = pozitiiOcupate;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public void setLimbiVorbite(String limbiVorbite) {
        this.limbiVorbite = limbiVorbite;
    }
}
