/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;

import org.hibernate.Session;
import vista.*;

/**
 *
 * @author acceso a datos
 */
public class controladorEnunciado6 {

    public static Session session;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    public static Enunciado6 ventana = new Enunciado6();
    

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public static void iniciaSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        depDAO = HibernateUtil.getDepartamentoDAO();
        empDAO = HibernateUtil.getEmpleadoDAO();
    }

    public static void cerrarSession() {
        session.close();
    }

    public static void queryuno() {
      try {
            HibernateUtil.beginTx(session);
            if (!ventana.getTxtApellido().getText().isEmpty())
                empDAO.buscaempleadosporapellido(session,ventana.getTxtApellido().getText().trim(),ventana.getTxtAreaEmpleados());
            HibernateUtil.commitTx(session);
        } catch (NumberFormatException ex) {
            session.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error en Queryuno");
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado6.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    public static void querydos() {
      if (ventana.getTxtNumDep().getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Faltan datos");
          return;
      }  
      try {
            limpiarventana();
            HibernateUtil.beginTx(session);
            empDAO.buscaempleadospordepartamento(session,Short.valueOf(ventana.getTxtNumDep().getText().trim())
                                                        ,ventana.getTxtAreaDepartamento()
                                                        ,ventana.getLblnombreDepartamento()
                                                        ,ventana.getLblNumeroEmpleados());
            HibernateUtil.commitTx(session);
        } catch (NumberFormatException ex) {
            session.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error en Querydos");
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void querytres() {
      try {
            limpiarventana();
            HibernateUtil.beginTx(session);
            empDAO.salariospordepartamento(session,ventana.getTxtAreaDepartamento()
                                                        ,ventana.getLblNumeroDepartamentos());                                            
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado6.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public static void querycuatro() {
      try {
            limpiarventana();
            HibernateUtil.beginTx(session);
            empDAO.empleadosdeferrolysantiago(session,ventana.getTxtAreaDepartamento()
                                                        ,ventana.getLblNumeroEmpleados());                                            
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private static void limpiarventana() {
        ventana.getTxtAreaDepartamento().setText("");
        ventana.getLblNumeroDepartamentos().setText("");
        ventana.getLblNumeroEmpleados().setText("");
        ventana.getLblnombreDepartamento().setText("");
    }

    
    
}
