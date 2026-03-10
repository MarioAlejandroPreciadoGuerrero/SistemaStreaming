/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Entidades.Plataforma;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IPlataformaDAO {
    boolean insertarPlataforma ( Plataforma p) ;
    boolean actualizarPlataforma ( Plataforma p) ;
    boolean eliminarPlataforma ( Long id ) ;
    List<Plataforma> consultarTodos () ;
    List<Plataforma> consultarLike () ;
}
