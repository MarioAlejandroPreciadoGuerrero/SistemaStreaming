/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Enum.paisOrigen;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ArtistaUI extends JFrame {

    private JTextField txtBuscarId, txtBuscarGeneral;
    private JTextField txtIdArtista, txtNombreArtistico, txtNombreReal, txtEmail, txtFechaNac, txtIdPerfil;
    private JComboBox<paisOrigen> cbPaisOrigen;
    private JButton btnGuardar, btnCancelar, btnBorrar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public ArtistaUI() {
        setTitle("Gestión de Artistas");
        setSize(1100, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- PANEL SUPERIOR: BÚSQUEDA ---
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        panelSuperior.add(new JLabel("ID:"));
        txtBuscarId = new JTextField(5);
        panelSuperior.add(txtBuscarId);
        panelSuperior.add(new JLabel("Buscar:"));
        txtBuscarGeneral = new JTextField(30);
        panelSuperior.add(txtBuscarGeneral);
        add(panelSuperior, BorderLayout.NORTH);

        // --- PANEL CENTRAL: FORMULARIO Y TABLA ---
        JPanel panelCentral = new JPanel(new BorderLayout(10, 10));
        panelCentral.setBorder(new EmptyBorder(0, 10, 10, 0));

        // Formulario Izquierdo
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.setBorder(BorderFactory.createTitledBorder("Datos del Artista"));
        panelIzquierdo.setPreferredSize(new Dimension(320, 0));

        JPanel panelCampos = new JPanel(new GridLayout(14, 1, 0, 2)); // 14 filas para etiquetas y campos
        panelCampos.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        panelCampos.add(new JLabel("ID Artista:"));
        txtIdArtista = new JTextField();
        panelCampos.add(txtIdArtista);
        panelCampos.add(new JLabel("Nombre Artístico:"));
        txtNombreArtistico = new JTextField();
        panelCampos.add(txtNombreArtistico);
        panelCampos.add(new JLabel("Nombre Real:"));
        txtNombreReal = new JTextField();
        panelCampos.add(txtNombreReal);
        panelCampos.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panelCampos.add(txtEmail);
        panelCampos.add(new JLabel("País de Origen:"));
        cbPaisOrigen = new JComboBox<>(paisOrigen.values());
        panelCampos.add(cbPaisOrigen);
        panelCampos.add(new JLabel("Fecha Nacimiento (yyyy-mm-dd):"));
        txtFechaNac = new JTextField();
        panelCampos.add(txtFechaNac);
        panelCampos.add(new JLabel("ID Perfil (FK):"));
        txtIdPerfil = new JTextField();
        panelCampos.add(txtIdPerfil);

        JPanel panelBotonesForm = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelBotonesForm.add(btnGuardar);
        panelBotonesForm.add(btnCancelar);

        panelIzquierdo.add(panelCampos, BorderLayout.NORTH);
        panelIzquierdo.add(panelBotonesForm, BorderLayout.SOUTH);
        panelCentral.add(panelIzquierdo, BorderLayout.WEST);

        // Tabla Central
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Artístico", "Real", "Email", "País", "Nacimiento", "ID Perfil"}, 0);
        tabla = new JTable(modeloTabla);
        panelCentral.add(new JScrollPane(tabla), BorderLayout.CENTER);

        add(panelCentral, BorderLayout.CENTER);

        // --- PANEL DERECHO: ACCIONES DE TABLA ---
        JPanel panelDerecho = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        panelDerecho.setPreferredSize(new Dimension(100, 0));
        btnBorrar = new JButton("Borrar");
        panelDerecho.add(btnBorrar);
        
        add(panelDerecho, BorderLayout.EAST);

        // Eventos
        btnCancelar.addActionListener(e -> limpiarFormulario());
    }

    private void limpiarFormulario() {
        txtIdArtista.setText("");
        txtNombreArtistico.setText("");
        txtNombreReal.setText("");
        txtEmail.setText("");
        cbPaisOrigen.setSelectedIndex(0);
        txtFechaNac.setText("");
        txtIdPerfil.setText("");
    }
}