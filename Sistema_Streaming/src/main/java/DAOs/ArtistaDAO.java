/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.Conexion;
import Entidades.Artista;
import Entidades.PerfilArtista;
import Entidades.PerfilArtista_;
import Enum.paisOrigen;
import Interface.IArtistaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USER
 */
public class ArtistaDAO implements IArtistaDAO {

    EntityManager em = Conexion.crearConexion();

    @Override
    public boolean insetarArtista(Artista a) {
        try {
            em.getTransaction().begin();
            
            em.persist(a);
            
            em.getTransaction().commit();
            
            System.out.println("El artista se ha insertado correctamente");
            
            return true;

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al incertar al Artista");
            em.getTransaction().isActive();
            em.getTransaction().rollback();
            
            return false;
            
        } finally {
            Conexion.cerrarConexion();
        }
    }

    @Override
    public boolean actualizarArtista(Artista a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarArtista(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Artista> consultaTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Artista> consultaLike() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
