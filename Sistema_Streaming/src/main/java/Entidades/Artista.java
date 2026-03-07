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
    private Long idArtista;
    
    @Column()
    private String nombreArtistico;
    
    @Column()
    private String nombreReal;
    
    @Column()
    private String Emali;
    
    @Enumerated
    @Column()
    private paisOrigen paisOrigen;
    
    @Column()
    private Date fechaNacimiento;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPerfil")
    private PerfilArtista perfil;

    public Artista() {
    }

    public Long getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Long idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getEmali() {
        return Emali;
    }

    public void setEmali(String Emali) {
        this.Emali = Emali;
    }

    public paisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(paisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public PerfilArtista getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilArtista perfil) {
        this.perfil = perfil;
    }
    
    
}
