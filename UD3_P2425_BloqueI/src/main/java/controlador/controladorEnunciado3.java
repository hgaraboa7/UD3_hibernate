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
import modelo.vo.Departamentos;
import org.hibernate.Session;
import vista.*;

/**
 *
 * @author acceso a datos
 */
public class controladorEnunciado3 {

    public static Session session;
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    public static Enunciado3 ventana = new Enunciado3();

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
    
    
    public static void cargardatos() {
        if (ventana.getTxtnumdep().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan datos");
            limpiardatos();
            return;
        }
        try {
            HibernateUtil.beginTx(session);
            //Cualquiera de los 2 métodos de búsqueda del departamento vale. Utiliza el que quieras. El primero 
            //Es por consulta, el segundo pasa la la clase y la clave.
           // Departamentos d = depDAO.buscarDepartamento(session, Short.valueOf(ventana.getTxtnumdep().getText()));
            Departamentos d = depDAO.getDepartamento(session, Short.valueOf(ventana.getTxtnumdep().getText()));
            if (d != null) {
                ventana.getTxtnombre().setText(d.getDnombre());
                ventana.getTxtlocalidad().setText(d.getLoc());
            } else {
                limpiardatos();
            }
            HibernateUtil.commitTx(session);
        } catch (NumberFormatException ex) {
            session.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error en la entrada de datos");
        } catch (Exception ex1) {
            session.getTransaction().rollback();
            Logger.getLogger(controladorEnunciado3.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
    private static void limpiardatos() {
        ventana.getTxtnombre().setText("");
        ventana.getTxtlocalidad().setText("");
    }
}
