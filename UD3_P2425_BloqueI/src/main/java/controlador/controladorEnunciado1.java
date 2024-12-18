/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.DepartamentoDAO;
import org.hibernate.Session;
import vista.Enunciado1;

/**
 *
 * @author acceso a datos
 */
public class controladorEnunciado1 {
    public static Session session;
    public static DepartamentoDAO depDAO;
    public static Enunciado1 ventana = new Enunciado1();
    
    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public static void iniciaSession() {
        session=HibernateUtil.getSessionFactory().openSession();
        depDAO=HibernateUtil.getDepartamentoDAO();
    }

    public static void cerrarSession() {
        session.close();       
    }

    public static void listarDepartamentos() { 
        try {
            HibernateUtil.beginTx(session);
            depDAO.cargadatos(session, ventana.getTxtArea());
            HibernateUtil.commitTx(session);
        } catch (Exception ex) {
            Logger.getLogger(controladorEnunciado1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
