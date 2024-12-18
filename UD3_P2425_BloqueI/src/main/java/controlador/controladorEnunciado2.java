/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import controlador.factory.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.dao.DepartamentoDAO;
import modelo.vo.Departamentos;
import org.hibernate.Session;
import vista.*;

/**
 *
 * @author acceso a datos
 */
public class controladorEnunciado2 {

    public static Session session;
    public static DepartamentoDAO depDAO;
    public static Enunciado2 ventana = new Enunciado2();
    static DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();
    static DefaultTableModel modelotabla = new DefaultTableModel();

    
    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getCmbDepartamento().setModel(modelocombo);
        modelotabla=(DefaultTableModel) ventana.getTblEmpleados().getModel();
    }

    public static void iniciaSession() {
        session=HibernateUtil.getSessionFactory().openSession();
        depDAO=HibernateUtil.getDepartamentoDAO();      
    }
    public static void cerrarSession() {
        session.close();       
    }
    
    public static void cargarcombo() {   
        try {
    
            HibernateUtil.beginTx(session);
            depDAO.cargacombo(session, modelocombo);            
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {          
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado2.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }
    public static void mostrarEmpleadosporDepartamento() {
     try {
           HibernateUtil.beginTx(session);  
           depDAO.mostrardatosEmpleadosentxtArea(session, (Departamentos) ventana.getCmbDepartamento().getSelectedItem(),
                    ventana.getTxtArea(),ventana.getLblnumempleados());
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado2.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }

    
    public static void mostrarEmpleadosporDepartamentoentabla() {
        try {        
            HibernateUtil.beginTx(session); 
            depDAO.mostrardatosEmpleadosentabla(session, (Departamentos) ventana.getCmbDepartamento().getSelectedItem(), modelotabla);        
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            Logger.getLogger(controladorEnunciado2.class.getName()).log(Level.SEVERE, null, ex);
        }             
      
    }

}
