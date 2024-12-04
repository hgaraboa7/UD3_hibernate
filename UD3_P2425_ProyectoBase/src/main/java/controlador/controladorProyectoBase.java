/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import modelo.dao.DepartamentoDAO;
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
    public static Principal ventana= new Principal();
    public static DefaultComboBoxModel modelocombo= new DefaultComboBoxModel();;
    
    
    public static void iniciar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getCmbDepartamento().setModel(modelocombo);
    }
    public static void iniciaSession(){
        session=HibernateUtil.getSessionFactory().openSession();
        depDAO=HibernateUtil.getDepartamentoDAO();
        
    }
    public static void cerrarSession(){
        session.close();
    }
    public static void listarDepartamentos(){
        try{
        HibernateUtil.beginTx(session);
        depDAO.cargardatos(session, ventana.getTxtAreaDep());
        HibernateUtil.commitTx(session);
        }catch(Exception ex){
            Logger.getLogger(controladorProyectoBase.class.getName()).log(Level.SEVERE, null, ex);
            
    }
    }

    public static void cargarCombo() {
   HibernateUtil.beginTx(session);
   depDAO.cargarCombo(session, modelocombo);
    
    
    }

    

}
