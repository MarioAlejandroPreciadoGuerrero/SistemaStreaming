/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Entidades.Artista;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IArtistaDAO {
    boolean insetarArtista ( Artista a) ;
    boolean actualizarArtista( Artista a) ;
    boolean eliminarArtista( Long id );
    List<Artista> consultaTodos () ;
    List<Artista> consultaLike () ;
}
