/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.vo.Hotel;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Hector.garaboacasas
 */
public class HotelDAO {

    public void cargarCombo(Session session, DefaultComboBoxModel modelocombo) {
  
        Query q=session.getNamedQuery("Hotel.findAll");
        
        List<Hotel> listaHotel=q.list();
        for(Hotel hotel: listaHotel){
            modelocombo.addElement(hotel);
        }
        
        
    }
    
    
    
}
