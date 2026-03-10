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
public class PlataformaUI extends JFrame {

   private JTextField txtBuscarId, txtBuscarGeneral;
    private JTextField txtId, txtNombre, txtUrl, txtFecha;
    private JButton btnGuardar, btnCancelar, btnBorrar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public PlataformaUI() {
        setTitle("Gestión de Plataformas");
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
        panelIzquierdo.setBorder(BorderFactory.createTitledBorder("Datos de la Plataforma"));
        panelIzquierdo.setPreferredSize(new Dimension(300, 0));

        JPanel panelCampos = new JPanel(new GridLayout(8, 1, 0, 5));
        panelCampos.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        panelCampos.add(new JLabel("ID Plataforma:"));
        txtId = new JTextField();
        panelCampos.add(txtId);
        panelCampos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCampos.add(txtNombre);
        panelCampos.add(new JLabel("URL:"));
        txtUrl = new JTextField();
        panelCampos.add(txtUrl);
        panelCampos.add(new JLabel("Fecha Lanzamiento (yyyy-mm-dd):"));
        txtFecha = new JTextField();
        panelCampos.add(txtFecha);

        JPanel panelBotonesForm = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelBotonesForm.add(btnGuardar);
        panelBotonesForm.add(btnCancelar);

        panelIzquierdo.add(panelCampos, BorderLayout.NORTH);
        panelIzquierdo.add(panelBotonesForm, BorderLayout.SOUTH);
        panelCentral.add(panelIzquierdo, BorderLayout.WEST);

        // Tabla Central
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "URL", "Fecha Lanzamiento"}, 0);
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
        txtId.setText("");
        txtNombre.setText("");
        txtUrl.setText("");
        txtFecha.setText("");
    }
}
