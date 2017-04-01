package ro.ase.licenta.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "PLANIFICARE_CONCEDII")
@Access(value = AccessType.FIELD)
public class PlanificareConcedii {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planconcedii_seq")
    @SequenceGenerator(name = "planconcedii_seq", sequenceName = "PLANIFICARECONCEDII_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "TIP_CONCEDIU", nullable = false)
    private String tipConcediu;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "ID_ANGAJATI", nullable = false)
    private int idAngajati;

    protected PlanificareConcedii() {

    }

    public int getId() {
        return id;
    }

    public String getTipConcediu() {
        return tipConcediu;
    }

    public Date getData() {
        return data;
    }

    public int getIdAngajati() {
        return idAngajati;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipConcediu(String tipConcediu) {
        this.tipConcediu = tipConcediu;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setIdAngajati(int idAngajati) {
        this.idAngajati = idAngajati;
    }
}
