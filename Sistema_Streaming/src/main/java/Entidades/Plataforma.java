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
@Table(name = "Plataformas")
public class Plataforma {

    @Id
    private Long idPlataforma;

    @Column()
    private String nombre;

    @Column()
    private String url;

    @Temporal(TemporalType.DATE)
    @Column()
    private Date fechaLanzamiento;

    @OneToMany(mappedBy = "plataforma", cascade = CascadeType.ALL)
    private List<PerfilArtista> listaPerfiles;

    public Plataforma() {
    }

    private Plataforma(Builder builder) {
        this.nombre = builder.nombre;
        this.url = builder.url;
        this.fechaLanzamiento = builder.fechaLanzamiento;
        this.listaPerfiles = builder.listaPerfiles;
    }

    public Long getIdPlataforma() {
        return idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public List<PerfilArtista> getListaPerfiles() {
        return listaPerfiles;
    }

    public static class Builder {

        private String nombre;
        private String url;
        private Date fechaLanzamiento;
        private List<PerfilArtista> listaPerfiles;
        
        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public Builder url (String url){
            this.url = url;
            return this;
        }
        
        public Builder fechaLanzamiento (Date fechaLanzamiento){
            this.fechaLanzamiento = fechaLanzamiento;
            return this;
        }
        
        public Builder listaPerfiles (List<PerfilArtista> listaPerfiles){
            this.listaPerfiles = listaPerfiles;
            return this;
        }
        
        public Plataforma build(){
            return new Plataforma(this);
        }
    }
}
