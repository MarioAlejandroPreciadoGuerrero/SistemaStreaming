/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USER
 */
public class MenuPrincipalUI extends JFrame {

  public MenuPrincipalUI() {
        
        setTitle("Sistema de Gestión - Menú Principal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 240, 240)); 

        // --- PANEL SUPERIOR  ---
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setBackground(new Color(45, 62, 140)); 
        panelEncabezado.setBorder(new EmptyBorder(15, 10, 15, 10)); 
        
        JLabel lblTitulo = new JLabel("Sistema de Gestión de Artistas");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 22));
        panelEncabezado.add(lblTitulo);
        
        add(panelEncabezado, BorderLayout.NORTH);

        
        JPanel panelBotones = new JPanel(new GridLayout(2, 2, 20, 20));
        panelBotones.setOpaque(false); 
        panelBotones.setBorder(new EmptyBorder(40, 50, 40, 50)); 

   
        JButton btnArtistas = crearBotonMenu("Módulo Artistas");
        JButton btnPerfiles = crearBotonMenu("Módulo Perfiles");
        JButton btnPlataformas = crearBotonMenu("Módulo Plataformas");
        JButton btnSalir = crearBotonMenu("Salir del Sistema"); 

        
        btnArtistas.addActionListener(e -> new ArtistaUI().setVisible(true));
        btnPerfiles.addActionListener(e -> new PerfilArtistaUI().setVisible(true));
        btnPlataformas.addActionListener(e -> new PlataformaUI().setVisible(true));
        btnSalir.addActionListener(e -> System.exit(0)); 

        panelBotones.add(btnArtistas);
        panelBotones.add(btnPerfiles);
        panelBotones.add(btnPlataformas);
        panelBotones.add(btnSalir);

        add(panelBotones, BorderLayout.CENTER);

        // --- PANEL INFERIOR (Pie de página) ---
        JPanel panelPie = new JPanel();
        panelPie.setOpaque(false);
        panelPie.setBorder(new EmptyBorder(0, 10, 20, 10)); 
        
        JLabel lblCreditos = new JLabel("Mario Alejandro Preciado Guerrero 252940");
        lblCreditos.setFont(new Font("SansSerif", Font.PLAIN, 12));
        panelPie.add(lblCreditos);
        
        add(panelPie, BorderLayout.SOUTH);
    }


    private JButton crearBotonMenu(String texto) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        boton.setBackground(Color.WHITE);
        boton.setFocusPainted(false); 
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
        return boton;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se pudo aplicar el estilo nativo.");
        }

        SwingUtilities.invokeLater(() -> {
            new MenuPrincipalUI().setVisible(true);
        });
    }
}
