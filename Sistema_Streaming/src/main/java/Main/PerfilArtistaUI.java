/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

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
public class PerfilArtistaUI extends JFrame {

    private JTextField txtBuscarId, txtBuscarGeneral;
    private JTextField txtIdPerfil, txtFechaRegistro, txtUserName, txtSeguidores, txtIdPlataforma;
    private JButton btnGuardar, btnCancelar, btnBorrar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public PerfilArtistaUI() {
        setTitle("Gestión de Perfiles de Artista");
        setSize(1000, 600);
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
        panelIzquierdo.setBorder(BorderFactory.createTitledBorder("Datos del Perfil"));
        panelIzquierdo.setPreferredSize(new Dimension(300, 0));

        JPanel panelCampos = new JPanel(new GridLayout(10, 1, 0, 5));
        panelCampos.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        panelCampos.add(new JLabel("ID Perfil:"));
        txtIdPerfil = new JTextField();
        panelCampos.add(txtIdPerfil);
        panelCampos.add(new JLabel("Fecha Registro (yyyy-mm-dd):"));
        txtFechaRegistro = new JTextField();
        panelCampos.add(txtFechaRegistro);
        panelCampos.add(new JLabel("Username:"));
        txtUserName = new JTextField();
        panelCampos.add(txtUserName);
        panelCampos.add(new JLabel("Seguidores:"));
        txtSeguidores = new JTextField();
        panelCampos.add(txtSeguidores);
        panelCampos.add(new JLabel("ID Plataforma (FK):"));
        txtIdPlataforma = new JTextField();
        panelCampos.add(txtIdPlataforma);

        JPanel panelBotonesForm = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelBotonesForm.add(btnGuardar);
        panelBotonesForm.add(btnCancelar);

        panelIzquierdo.add(panelCampos, BorderLayout.NORTH);
        panelIzquierdo.add(panelBotonesForm, BorderLayout.SOUTH);
        panelCentral.add(panelIzquierdo, BorderLayout.WEST);

        // Tabla Central
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Fecha", "Username", "Seguidores", "Plataforma"}, 0);
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
        txtIdPerfil.setText("");
        txtFechaRegistro.setText("");
        txtUserName.setText("");
        txtSeguidores.setText("");
        txtIdPlataforma.setText("");
    }
}
