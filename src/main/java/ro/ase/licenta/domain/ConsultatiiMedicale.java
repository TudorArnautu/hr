package ro.ase.licenta.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "CONSULTATII_MEDICALE")
@Access(value = AccessType.FIELD)
public class ConsultatiiMedicale {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consultatii_seq")
    @SequenceGenerator(name = "consultatii_seq", sequenceName = "CONSULTATIIMEDICALE_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "ID_ANGAJAT", nullable = false)
    private int idAngajat;

    protected ConsultatiiMedicale() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public int getIdAngajat() {
        return idAngajat;
    }
}
