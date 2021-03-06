package vistas;

import dao.DaoManager;
import dao.mysql.MysqlDaoManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jose Suarez Principe and Angy Quispe Ramirez 
 * Escuela de Informartica
 * Universidad Nacional de Trujillo
 * blue = [34,70,135]
 * lighblue = [184,207,229]
 */
public class frmPrincipal extends javax.swing.JFrame {

    private int x, y;
    private JPanel panelEquipos;
    private JPanel panelCursos;
    private JPanel panelInicio = new panelInicio(this);
    private JPanel panelUser;
    private JPanel panelBD;
    private JPanel panelHistorial;
    private JPanel panelReportes;
    private JPanel panelHistorialInicio;
    private JPanel panelSesionDirecta;
    
    private DaoManager manager;
    
    ArrayList<JButton> listaBotones = new ArrayList<>();
    
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logolamparaenfermeria2.png")).getImage());
        
        cambiarPanel("Inicio", panelInicio);
        /*  
        --> Codigo de centrado
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar); 
        */
        try {
            manager = MysqlDaoManager.getMysqlDaoManager();
            lblNombreAdmin.setText(manager.getDaoAdministrador().obtener().getUser());
            lblNombreCompletoAdmin.setText(manager.getDaoAdministrador().obtener().getNombreCompleto());
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
        listaBotones.add(btnInicio);
        listaBotones.add(btnUsuarios);
        listaBotones.add(btnEquipos);
        listaBotones.add(btnCursos);
        listaBotones.add(btnHistorial);
        listaBotones.add(btnReportes);
        listaBotones.add(btnBD);
        listaBotones.add(btnSesionesDirectas);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnMinizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();
        lblNombreAdmin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNombreCompletoAdmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEquipos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnBD = new javax.swing.JButton();
        btnSesionesDirectas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSeccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 70, 135));

        barra.setBackground(new java.awt.Color(34, 70, 135));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(34, 70, 135));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMinizar.setBackground(new java.awt.Color(34, 70, 135));
        btnMinizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinizar.setText("_");
        btnMinizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinizar.setFocusable(false);
        btnMinizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ESCUELA DE ENFERMERIA - UNT");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinizar)
                .addGap(5, 5, 5)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMinizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(4, 4, 4))
        );

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UNIDAD DE CÓMPUTO E INFORMÁTICA ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OLGA YIKA DE TORRE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Universidad Nacional de Trujillo");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_");
        jLabel1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desktop-64-white.png"))); // NOI18N

        btnConfiguracion.setBackground(new java.awt.Color(34, 70, 135));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seettings-24-white.png"))); // NOI18N
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setFocusable(false);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        lblNombreAdmin.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        lblNombreAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreAdmin.setText("Nombre del Administrador");
        lblNombreAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADMINISTRADOR ");

        lblNombreCompletoAdmin.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        lblNombreCompletoAdmin.setForeground(new java.awt.Color(34, 70, 135));
        lblNombreCompletoAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreCompletoAdmin.setText("Nombre del Administrador");
        lblNombreCompletoAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreCompletoAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 882, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(lblNombreAdmin))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreCompletoAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombreAdmin)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel9))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));

        jPanel3.setBackground(new java.awt.Color(34, 70, 135));

        btnEquipos.setBackground(new java.awt.Color(34, 70, 135));
        btnEquipos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnEquipos.setForeground(java.awt.Color.white);
        btnEquipos.setText("EQUIPOS");
        btnEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEquipos.setFocusable(false);
        btnEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(34, 70, 135));
        btnUsuarios.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnUsuarios.setForeground(java.awt.Color.white);
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCursos.setBackground(new java.awt.Color(34, 70, 135));
        btnCursos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnCursos.setForeground(java.awt.Color.white);
        btnCursos.setText("CURSOS");
        btnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCursos.setFocusable(false);
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(34, 70, 135));
        btnHistorial.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnHistorial.setForeground(java.awt.Color.white);
        btnHistorial.setText("HISTORIAL DE REGISTROS");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setFocusable(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(34, 70, 135));
        btnReportes.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnReportes.setForeground(java.awt.Color.white);
        btnReportes.setText("REPORTES");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setFocusable(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(184, 207, 229));
        btnInicio.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnInicio.setForeground(java.awt.Color.white);
        btnInicio.setText("INICIO");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusable(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnBD.setBackground(new java.awt.Color(34, 70, 135));
        btnBD.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnBD.setForeground(java.awt.Color.white);
        btnBD.setText("BASE DE DATOS");
        btnBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBD.setFocusable(false);
        btnBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDActionPerformed(evt);
            }
        });

        btnSesionesDirectas.setBackground(new java.awt.Color(34, 70, 135));
        btnSesionesDirectas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        btnSesionesDirectas.setForeground(java.awt.Color.white);
        btnSesionesDirectas.setText("SESIONES DIRECTAS");
        btnSesionesDirectas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSesionesDirectas.setFocusable(false);
        btnSesionesDirectas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionesDirectasActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Versión 1.1.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSesionesDirectas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSesionesDirectas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        panelContenido.setBackground(new java.awt.Color(34, 34, 34));
        panelContenido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white)));
        panelContenido.setPreferredSize(new java.awt.Dimension(1260, 517));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1273, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(184, 207, 229));
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(0, 10));

        jPanel5.setBackground(new java.awt.Color(184, 207, 229));

        lblSeccion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSeccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeccion.setText("> INICIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblSeccion)
                .addContainerGap(1196, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblSeccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinizarActionPerformed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinizarActionPerformed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_barraMouseDragged

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        this.dispose();
        frmAdministrador fa = new frmAdministrador();
        fa.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiposActionPerformed
        panelEquipos = new panelEquipos();
        cambiarPanel("EQUIPOS", panelEquipos);
        pintarBoton(btnEquipos);
    }//GEN-LAST:event_btnEquiposActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        panelCursos = new panelCursos();
        cambiarPanel("CURSOS", panelCursos);
        pintarBoton(btnCursos);
    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        panelUser = new panelUser();
        cambiarPanel("USUARIOS",panelUser);
        pintarBoton(btnUsuarios);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicio = new panelInicio(this);
        cambiarPanel("INICIO", panelInicio);
        pintarBoton(btnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDActionPerformed
        panelBD = new panelBaseDeDatos();
        cambiarPanel("BASE DE DATOS", panelBD);
        pintarBoton(btnBD);
    }//GEN-LAST:event_btnBDActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        panelHistorialInicio = new panelHistorialInicio(panelContenido);
        cambiarPanel("HISTORIAL DE REGISTROS", panelHistorialInicio);
        pintarBoton(btnHistorial);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        panelReportes = new panelReportes();
        cambiarPanel("REPORTES", panelReportes);
        pintarBoton(btnReportes);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnSesionesDirectasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionesDirectasActionPerformed
        panelSesionDirecta = new panelSesionDirecta();
        cambiarPanel("SESION DIRECTA", panelSesionDirecta);
        pintarBoton(btnSesionesDirectas);
    }//GEN-LAST:event_btnSesionesDirectasActionPerformed

    public void cambiarPanel(String seccion, JPanel panelElegido){
        panelElegido.setSize(1272, 515);
        panelElegido.setLocation(1, 1);
        panelContenido.removeAll();
        panelContenido.add(panelElegido,BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
        lblSeccion.setText("> "+seccion);
    }
        
    public void pintarBoton(JButton boton){
        listaBotones.forEach((btn) -> {
            if(btn == boton){
                btn.setBackground(new Color(184,207, 229));
            }else{
                btn.setBackground(new Color(30, 70, 135));
            }
        });
    }
    
    public JLabel getLabelTitulo(){
        return this.lblSeccion;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnBD;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMinizar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSesionesDirectas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    static javax.swing.JLabel lblNombreAdmin;
    static javax.swing.JLabel lblNombreCompletoAdmin;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables



}
