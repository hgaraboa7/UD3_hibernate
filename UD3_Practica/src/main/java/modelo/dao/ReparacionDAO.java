/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import controlador.controladorPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.vo.Reparaciones;
import org.hibernate.Session;

/**
 *
 * @author hecto
 */
public class ReparacionDAO {
    
    public void insertar(Session session, Reparaciones repara){
        try{
        session.save(repara);
        System.out.println("insertada reparacion");
        }catch(Exception ex){
            Logger.getLogger(ReparacionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
    }
    
}
