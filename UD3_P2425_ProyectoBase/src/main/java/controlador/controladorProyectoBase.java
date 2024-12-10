/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import vista.Principal;

/**
 *
 * @author acceso a datos
 */
public class controladorProyectoBase {

    //captura
    public static Session session;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    public static Principal ventana = new Principal();
    public static DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();

    ;
    
    
    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getCmbDepartamento().setModel(modelocombo);
    }

    public static void iniciaSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        depDAO = HibernateUtil.getDepartamentoDAO();
        empDAO = HibernateUtil.getEmpleadoDAO();

    }

    public static void cerrarSession() {
        session.close();
    }

    public static void listarDepartamentos() {
        try {
            HibernateUtil.beginTx(session);
            depDAO.cargardatos(session, ventana.getTxtAreaDep());
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            Logger.getLogger(controladorProyectoBase.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void cargarCombo() {
        HibernateUtil.beginTx(session);
        depDAO.cargarCombo(session, modelocombo);

    }

    public static void listarEmpleadosDepartamento() {

        try {
            HibernateUtil.beginTx(session);
            empDAO.cargarEmpleados(session, ventana.getTxtAreaDep(),
                    (Departamentos) ventana.getCmbDepartamento().getSelectedItem(),
                    ventana.getLblTotalEmp());
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            Logger.getLogger(controladorProyectoBase.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void cargarDatos() {

        if (ventana.getTxtDepNo().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "faltan datos");
            limpiardatos();
        }
        try {
            HibernateUtil.beginTx(session);
            
            Departamentos dep=depDAO.getDepartamento(session, Short.valueOf(ventana.getTxtDepNo().getText()));

            if(dep!=null){
                ventana.getTxtNombre().setText(dep.getDnombre());
                ventana.getTxtLocalidad().setText(dep.getLoc());
                            }else{
                limpiardatos();
            }
            HibernateUtil.commitTx(session);
        } catch (NumberFormatException ex) {
            Logger.getLogger(controladorProyectoBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex1) {
            Logger.getLogger(controladorProyectoBase.class.getName()).log(Level.SEVERE, null, ex1);
        }

    }

    public static void limpiardatos() {
        ventana.getTxtDepNo().setText("");
        ventana.getTxtNombre().setText("");
        ventana.getTxtLocalidad().setText("");

    }

}
