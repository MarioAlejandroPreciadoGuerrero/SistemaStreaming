/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author USER
 */
@Entity
@Table()
public class PerfilArtista {

    @Id
    private Long idPerfil;

    @Temporal(TemporalType.DATE)
    @Column()
    private Date fechaRegistro;

    @Column()
    private String userName;

    @Column()
    private Long segidores;

    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private List<Artista> listaArtistas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPlataforma")
    private Plataforma plataforma;

    public PerfilArtista() {
    }
    
    private PerfilArtista(Builder builder){
        this.fechaRegistro = builder.fechaRegistro;
        this.userName = builder.userName;
        this.segidores = builder.segidores;
        this.listaArtistas = builder.listaArtistas;
        this.plataforma = builder.plataforma;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public String getUserName() {
        return userName;
    }
    public Long getSegidores() {
        return segidores;
    }
    public List<Artista> getListaArtistas() {
        return listaArtistas;
    }
    public Plataforma getPlataforma() {
        return plataforma;
    }
    
    

    public static class Builder {

        private Date fechaRegistro;
        private String userName;
        private Long segidores;
        private List<Artista> listaArtistas;
        private Plataforma plataforma;
        
        public Builder fechaRegistro (Date fechaRegistro){
            this.fechaRegistro = fechaRegistro;
            return this;
        }
        
        public Builder userName (String userName){
            this.userName = userName;
            return this;
        }
        
        public Builder segidores (Long segidores){
            this.segidores = segidores;
            return this;
        }
        
        public Builder listaArtistas (List<Artista> listaArtistas){
            this.listaArtistas = listaArtistas;
            return this;
        }
        
        public Builder plataforma (Plataforma plataforma){
            this.plataforma = plataforma;
            return this;
        }
        
        public PerfilArtista build(){
            return new PerfilArtista(this);
        }
    }
}
