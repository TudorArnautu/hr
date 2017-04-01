package ro.ase.licenta.domain;

import javax.persistence.*;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "LOGIN")
@Access(value = AccessType.FIELD)
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login_seq")
    @SequenceGenerator(name = "login_seq", sequenceName = "LOGIN_SEQ")
    @Column(name = "ID_ANGAJATI", nullable = false)
    private int idAngajati;

    @Column(name = "NUME_UTILIZATOR", nullable = false)
    private String numeUtilizator;

    @Column(name = "PAROLA", nullable = false)
    private String parola;

    protected Login() {

    }

    public int getIdAngajati() {
        return idAngajati;
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public String getParola() {
        return parola;
    }

    public void setIdAngajati(int idAngajati) {
        this.idAngajati = idAngajati;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
