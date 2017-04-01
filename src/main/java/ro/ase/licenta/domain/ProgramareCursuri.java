package ro.ase.licenta.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "PROGRAMARE_CURSURI")
@Access(value = AccessType.FIELD)
public class ProgramareCursuri {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "progcursuri_seq")
    @SequenceGenerator(name = "progcursuri_seq", sequenceName = "PROGRAMARECURSURI_SEQ")
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "ID_CURSANTI", nullable = false)
    private int idCursanti;

    protected ProgramareCursuri() {

    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public int getIdCursanti() {
        return idCursanti;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setIdCursanti(int idCursanti) {
        this.idCursanti = idCursanti;
    }
}
