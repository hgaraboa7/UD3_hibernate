/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.HibernateUtil;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.dao.ClienteDAO;
import modelo.dao.HotelDAO;
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
        
        HibernateUtil.beginTx(session);
        Cliente cli;
        if((cli=clienteDAO.existe(session, ventana.getTxtNombreCliente().getText()))==null){
            return;
        }
        System.out.println(cli.toString());
        if(Integer.valueOf(ventana.getTxtNumHabitaciones().getText())<1){
            JOptionPane.showMessageDialog(null, "no puede ser negativo el numero de habitaciones");
            return;
            
        }
        
        
        
        session.getTransaction().commit();
        
    }
    
    
   
}
