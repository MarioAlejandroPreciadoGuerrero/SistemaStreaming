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
@Table( )
public class PerfilArtista {
    
    @Id
    private Long idPerfil;
    
    @Column()
    private Date fechaRegistro;
    
    @Column()
    private String userName;
    
    @Column()
    private Long Segidores;
    
    @OneToMany(mappedBy = "perfil",cascade = CascadeType.ALL)
    private List<Artista> listaArtistas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPlataforma")
    private Plataforma plataforma;

    public PerfilArtista() {
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getSegidores() {
        return Segidores;
    }

    public void setSegidores(Long Segidores) {
        this.Segidores = Segidores;
    }

    public List<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(List<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
    
    
}
