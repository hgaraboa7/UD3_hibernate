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
import modelo.dao.AlojaDAO;
import modelo.dao.ClienteDAO;
import modelo.dao.HotelDAO;
import modelo.vo.Aloja;
import modelo.vo.Cliente;
import modelo.vo.Hotel;
import org.hibernate.Session;
import vista.Principal;

/**
 *
 * @author acceso a datos
 */
public class controladorPrincipal {
 
 public static Session session; 
//declara los objetos DAO
 public static HotelDAO hotelDAO;
 public static ClienteDAO clienteDAO;
 public static AlojaDAO alojaDAO;
 public static Cliente cli;
 
 public static DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();
    
 public static Principal ventana = new Principal();
  public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.getCmbHotel().setModel(modelocombo);
    }

    public static void iniciaSession() {
        session=HibernateUtil.getSessionFactory().openSession();
        //crear los objetos DAO   
        hotelDAO=HibernateUtil.getHotelDAO();
        clienteDAO=HibernateUtil.getClienteDAO();
        alojaDAO=HibernateUtil.getAlojaDAO();
    }

    public static void cerrarSession() {
        session.close();       
    }

    public static void cargarCombo() {
  
        HibernateUtil.beginTx(session);
        hotelDAO.cargarCombo(session, modelocombo);
        session.getTransaction().commit();
        
    }

    public static void existeCliente() {
  
        if(ventana.getTxtNombreCliente().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Falta el nombre de cliente");
            return;
        }
        
        try{
        
        HibernateUtil.beginTx(session);
        
        int numHab;
        if((cli=clienteDAO.existe(session, ventana.getTxtNombreCliente().getText()))==null){
            return;
        }
//        System.out.println(cli.toString());
//        if(ventana.getTxtNumHabitaciones().getText().isEmpty()||Integer.valueOf(ventana.getTxtNumHabitaciones().getText())<1){
//            JOptionPane.showMessageDialog(null, "el numero de habitaciones no es un numero positivo");
//            return;
//        }
//        if((numHab=hotelDAO.comprobarHabitaciones(session,Integer.valueOf(ventana.getTxtNumHabitaciones().getText()),(Hotel)modelocombo.getSelectedItem()))<0){
//             JOptionPane.showMessageDialog(null, "el numero de habitaciones introducido excede al numero disponible");
//            return;
//        }
        
        
        
        
        HibernateUtil.commitTx(session);
        
        }catch(NumberFormatException ex){
            session.getTransaction().rollback();
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);            
        }catch(Exception ex1){
            session.getTransaction().rollback();
             Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex1);
        }
         
        
    }

    public static void facturar() {
        
        if(ventana.getTxtNombreCliente().getText().isEmpty()||ventana.getTxtNumHabitaciones().getText().isEmpty()
                ||ventana.getDcFechaEntrada().getDate().equals(null)){
            JOptionPane.showMessageDialog(null, "Faltan datos");
            return;
        }
        
        try{
        HibernateUtil.beginTx(session);
        Aloja aloj;
        int numHab;
        System.out.println(cli.toString());
        if(ventana.getTxtNumHabitaciones().getText().isEmpty()||Integer.valueOf(ventana.getTxtNumHabitaciones().getText())<1){
            JOptionPane.showMessageDialog(null, "el numero de habitaciones no es un numero positivo");
            return;
        }
        if((numHab=hotelDAO.comprobarHabitaciones(session,Integer.valueOf(ventana.getTxtNumHabitaciones().getText()),(Hotel)modelocombo.getSelectedItem()))<0){
             JOptionPane.showMessageDialog(null, "el numero de habitaciones introducido excede al numero disponible");
            return;
        }
        //comprobar cliente 2 hoteles
        
//        if((aloj=alojaDAO.getAloja(session,cli))!=null){
//             JOptionPane.showMessageDialog(null, "el cliente no puede estar en dos hoteles a la vez ");
//            return;
//        }
        
        if((aloj=alojaDAO.comprobar(session,cli,(Hotel)modelocombo.getSelectedItem(),
                Integer.valueOf(ventana.getTxtNumHabitaciones().getText()),
                        ventana.getDcFechaEntrada().getDate()))==null){
            JOptionPane.showMessageDialog(null, " ");
            return;
        }
        
        
        
        
        HibernateUtil.commitTx(session); 
    
    }catch(NumberFormatException ex){
            session.getTransaction().rollback();
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);            
        }catch(Exception ex1){
            session.getTransaction().rollback();
             Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }
   
}
