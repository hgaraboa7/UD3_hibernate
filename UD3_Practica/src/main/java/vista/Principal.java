/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.controladorPrincipal;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.vo.Coches;

/**
 *
 * @author AD
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        controladorPrincipal.iniciaSession();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogCliente = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        txtNomCli = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTfno = new javax.swing.JTextField();
        btnAltaCli = new javax.swing.JButton();
        btnBajaCli = new javax.swing.JButton();
        btnModifCli = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        DialogCoche = new javax.swing.JDialog();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        btnInsertCoche = new javax.swing.JButton();
        btnBajaCoche = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        DialogReparaciones = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRepEmpleado = new javax.swing.JTextField();
        txtRepMatricula = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        txtRepFechaEnt = new javax.swing.JTextField();
        txtRepFechaSal = new javax.swing.JTextField();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        DialogTablaCoches = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCoches = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReparaciones = new javax.swing.JButton();

        jLabel1.setText("Codigo Cliente");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Email");

        jLabel6.setText("Telefono");

        txtCodCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodCliFocusLost(evt);
            }
        });

        btnAltaCli.setText("Alta Cliente");
        btnAltaCli.setEnabled(false);
        btnAltaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCliActionPerformed(evt);
            }
        });

        btnBajaCli.setText("Baja Cliente");
        btnBajaCli.setEnabled(false);

        btnModifCli.setText("Modificar");
        btnModifCli.setEnabled(false);
        btnModifCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifCliActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Coches");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogClienteLayout = new javax.swing.GroupLayout(DialogCliente.getContentPane());
        DialogCliente.getContentPane().setLayout(DialogClienteLayout);
        DialogClienteLayout.setHorizontalGroup(
            DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogClienteLayout.createSequentialGroup()
                .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAltaCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnBajaCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifCli))
                    .addGroup(DialogClienteLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnMostrar)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogClienteLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTfno)
                            .addComponent(txtEmail)
                            .addComponent(txtCodCli)
                            .addComponent(txtNomCli)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        DialogClienteLayout.setVerticalGroup(
            DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnMostrar)
                .addGap(281, 281, 281)
                .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifCli)
                    .addComponent(btnAltaCli)
                    .addComponent(btnBajaCli))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(DialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addGap(1, 1, 1)
                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtTfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );

        txtPropietario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPropietarioFocusLost(evt);
            }
        });

        btnInsertCoche.setText("Insertar");
        btnInsertCoche.setEnabled(false);
        btnInsertCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCocheActionPerformed(evt);
            }
        });

        btnBajaCoche.setText("Baja coche");
        btnBajaCoche.setEnabled(false);
        btnBajaCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCocheActionPerformed(evt);
            }
        });

        jLabel2.setText("Matricula");

        jLabel7.setText("Marca");

        jLabel8.setText("Modelo");

        jLabel9.setText("Nombre Cliente");

        txtMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatriculaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout DialogCocheLayout = new javax.swing.GroupLayout(DialogCoche.getContentPane());
        DialogCoche.getContentPane().setLayout(DialogCocheLayout);
        DialogCocheLayout.setHorizontalGroup(
            DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCocheLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnInsertCoche)
                .addGap(43, 43, 43)
                .addComponent(btnBajaCoche)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogCocheLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtMatricula)
                        .addComponent(txtMarca)
                        .addComponent(txtModelo)
                        .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        DialogCocheLayout.setVerticalGroup(
            DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogCocheLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBajaCoche)
                    .addComponent(btnInsertCoche))
                .addGap(59, 59, 59))
            .addGroup(DialogCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogCocheLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(4, 4, 4)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addGap(3, 3, 3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addGap(4, 4, 4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        jLabel11.setText("Empleado");

        jLabel12.setText("Matricula");

        jLabel13.setText("Importe");

        jLabel14.setText("Fecha Entrada");

        jLabel15.setText("Fecha Salida");

        txtRepFechaEnt.setText("2025-12-01 00:00:00");
        txtRepFechaEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepFechaEntActionPerformed(evt);
            }
        });

        txtRepFechaSal.setText("2025-12-02 00:00:00");
        txtRepFechaSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepFechaSalActionPerformed(evt);
            }
        });

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setText("Salida");

        javax.swing.GroupLayout DialogReparacionesLayout = new javax.swing.GroupLayout(DialogReparaciones.getContentPane());
        DialogReparaciones.getContentPane().setLayout(DialogReparacionesLayout);
        DialogReparacionesLayout.setHorizontalGroup(
            DialogReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogReparacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(txtRepFechaSal, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(txtRepFechaEnt)
                        .addComponent(txtImporte)
                        .addComponent(txtRepMatricula)
                        .addComponent(txtRepEmpleado))
                    .addGroup(DialogReparacionesLayout.createSequentialGroup()
                        .addComponent(btnEntrada)
                        .addGap(49, 49, 49)
                        .addComponent(btnSalida)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        DialogReparacionesLayout.setVerticalGroup(
            DialogReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogReparacionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepFechaEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepFechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(DialogReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrada)
                    .addComponent(btnSalida))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        DialogTablaCoches.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                DialogTablaCochesWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                DialogTablaCochesWindowOpened(evt);
            }
        });

        tablaCoches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaCoches);

        javax.swing.GroupLayout DialogTablaCochesLayout = new javax.swing.GroupLayout(DialogTablaCoches.getContentPane());
        DialogTablaCoches.getContentPane().setLayout(DialogTablaCochesLayout);
        DialogTablaCochesLayout.setHorizontalGroup(
            DialogTablaCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogTablaCochesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        DialogTablaCochesLayout.setVerticalGroup(
            DialogTablaCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogTablaCochesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Coche");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnReparaciones.setText("Reparaciones");
        btnReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btnReparaciones)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnReparaciones))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCliActionPerformed
        controladorPrincipal.insertarCliente();
    }//GEN-LAST:event_btnAltaCliActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controladorPrincipal.cerrarSession();
    }//GEN-LAST:event_formWindowClosed

    private void txtCodCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodCliFocusLost
        controladorPrincipal.comprobarCliente();
    }//GEN-LAST:event_txtCodCliFocusLost

    private void btnModifCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifCliActionPerformed
        controladorPrincipal.modificarCliente();
    }//GEN-LAST:event_btnModifCliActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        DialogTablaCoches.setVisible(true);
        DialogTablaCoches.setSize(450, 600);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnInsertCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCocheActionPerformed
        controladorPrincipal.altaCoche();
    }//GEN-LAST:event_btnInsertCocheActionPerformed

    private void btnBajaCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaCocheActionPerformed
        controladorPrincipal.bajaCoche();
    }//GEN-LAST:event_btnBajaCocheActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DialogCliente.setVisible(true);
        DialogCliente.setSize(386, 489);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DialogCoche.setVisible(true);
       DialogCoche.setSize(386, 489);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPropietarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPropietarioFocusLost
        
    }//GEN-LAST:event_txtPropietarioFocusLost

    private void txtMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatriculaFocusLost
        controladorPrincipal.comprobarCoche();
    }//GEN-LAST:event_txtMatriculaFocusLost

    private void btnReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparacionesActionPerformed
       DialogReparaciones.setVisible(true);
       DialogReparaciones.setSize(386, 489);
    }//GEN-LAST:event_btnReparacionesActionPerformed

    private void DialogTablaCochesWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_DialogTablaCochesWindowOpened
       // controladorPrincipal.mostrarCoches();
    }//GEN-LAST:event_DialogTablaCochesWindowOpened

    private void DialogTablaCochesWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_DialogTablaCochesWindowActivated
       controladorPrincipal.mostrarCoches();
    }//GEN-LAST:event_DialogTablaCochesWindowActivated

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        controladorPrincipal.entradaReparacion();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void txtRepFechaSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepFechaSalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepFechaSalActionPerformed

    private void txtRepFechaEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepFechaEntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepFechaEntActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogCliente;
    private javax.swing.JDialog DialogCoche;
    private javax.swing.JDialog DialogReparaciones;
    private javax.swing.JDialog DialogTablaCoches;
    private javax.swing.JButton btnAltaCli;
    private javax.swing.JButton btnBajaCli;
    private javax.swing.JButton btnBajaCoche;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnInsertCoche;
    private javax.swing.JButton btnModifCli;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReparaciones;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCoches;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtRepEmpleado;
    private javax.swing.JTextField txtRepFechaEnt;
    private javax.swing.JTextField txtRepFechaSal;
    private javax.swing.JTextField txtRepMatricula;
    private javax.swing.JTextField txtTfno;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAltaCli() {
        return btnAltaCli;
    }

    public JButton getBtnBajaCli() {
        return btnBajaCli;
    }

    public JButton getBtnModifCli() {
        return btnModifCli;
    }

    public JTextField getTxtCodCli() {
        return txtCodCli;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtNomCli() {
        return txtNomCli;
    }

    public JTextField getTxtTfno() {
        return txtTfno;
    }

    public JButton getBtnBajaCoche() {
        return btnBajaCoche;
    }

    public JButton getBtnInsertCoche() {
        return btnInsertCoche;
    }

    public JButton getBtnMostrar() {
        return btnMostrar;
    }

    public JTable getTablaCoches() {
        return tablaCoches;
    }

   

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public JTextField getTxtPropietario() {
        return txtPropietario;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public JButton getBtnSalida() {
        return btnSalida;
    }

    public JTextField getTxtImporte() {
        return txtImporte;
    }

    public JTextField getTxtRepEmpleado() {
        return txtRepEmpleado;
    }

    public JTextField getTxtRepFechaEnt() {
        return txtRepFechaEnt;
    }

    public JTextField getTxtRepFechaSal() {
        return txtRepFechaSal;
    }

    public JTextField getTxtRepMatricula() {
        return txtRepMatricula;
    }

    


}
