package ro.ase.licenta.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arnau on 25.03.2017.
 */
@Entity
@Table(name = "CURSANTI")
@Access(value = AccessType.FIELD)
public class Cursanti {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cursanti_seq")
        @SequenceGenerator(name = "cursanti_seq", sequenceName = "CURSANTI_SEQ")
        @Column(name = "ID", nullable = false)
        private int id;

        @Column(name = "NUMAR_CURSANTI", nullable = false)
        private int numarCursanti;

        @Column(name = "NIVEL_CUNOSTINTE", nullable = false)
        private String nivelCunostinte;

        public int getNumarCursanti() {
                return numarCursanti;
        }

        public String getNivelCunostinte() {
                return nivelCunostinte;
        }

        public int getId() {
                return id;
        }


}
