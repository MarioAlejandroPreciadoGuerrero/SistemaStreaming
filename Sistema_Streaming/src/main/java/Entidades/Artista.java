/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enum.paisOrigen;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "Artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtista;

    @Column()
    private String nombreArtistico;

    @Column()
    private String nombreReal;

    @Column()
    private String Emali;

    @Enumerated(EnumType.STRING)
    @Column()
    private paisOrigen paisOrigen;

    @Temporal(TemporalType.DATE)
    @Column()
    private Date fechaNacimiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPerfil")
    private PerfilArtista perfil;

    public Artista() {
    }

    private Artista(Builder builder) {
        this.nombreArtistico = builder.nombreArtistico;
        this.nombreReal = builder.nombreReal;
        this.Emali = builder.Emali;
        this.paisOrigen = builder.paisOrigen;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.perfil = builder.perfil;
    }

    public Long getIdArtista() {
        return idArtista;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getEmali() {
        return Emali;
    }

    public paisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public PerfilArtista getPerfil() {
        return perfil;
    }

    public static class Builder {

        private String nombreArtistico;
        private String nombreReal;
        private String Emali;
        private paisOrigen paisOrigen;
        private Date fechaNacimiento;
        private PerfilArtista perfil;

        public Builder nombreArtistico(String nombreArtistico) {
            this.nombreArtistico = nombreArtistico;
            return this;
        }

        public Builder nombreReal(String nombreReal) {
            this.nombreReal = nombreReal;
            return this;
        }

        public Builder Email(String Email) {
            this.Emali = Email;
            return this;
        }

        public Builder paisOrigen(paisOrigen paisOrigen1) {
            this.paisOrigen = paisOrigen1;
            return this;
        }

        public Builder fechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder perfil(PerfilArtista perfil) {
            this.perfil = perfil;
            return this;
        }

        public Artista build() {
            return new Artista(this);
        }

    }
}
