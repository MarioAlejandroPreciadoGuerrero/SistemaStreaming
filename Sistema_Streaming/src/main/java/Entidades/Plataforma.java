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
@Table (name = "Plataformas")
public class Plataforma {
      
    @Id
    private Long idPlataforma;
    
    @Column()
    private String nombre;
    
    @Column()
    private String url;
    
    @Column()
    private Date fechaLanzamiento;
    
    @OneToMany(mappedBy = "plataforma",cascade = CascadeType.ALL)
    private List<PerfilArtista> listaPerfiles;

    public Plataforma() {
    }

    public Long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Long idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public List<PerfilArtista> getListaPerfiles() {
        return listaPerfiles;
    }

    public void setListaPerfiles(List<PerfilArtista> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }
    
    
}
