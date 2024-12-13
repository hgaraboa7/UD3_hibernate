/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import modelo.vo.Cliente;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Hector.garaboacasas
 */
public class ClienteDAO {

    public Cliente existe(Session session, String nom) {
   
        String consulta="select c from Cliente c where c.nombre=:nom";
        Query q=session.createQuery(consulta);
        q.setParameter("nom", nom);
        
        return (Cliente)q.uniqueResult();
        
    }
    
}
