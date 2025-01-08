/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.vo.Coches;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author hecto
 */
public class CocheDAO {

    public ArrayList<Coches> getCoches(Session session, String codcli) {
  
        Query q=session.createQuery("Select from Coches c where c.codcli =:codcli");
        q.setParameter("codcli", codcli);
       
        return (ArrayList<Coches>) q.list();
    
    }

    public void insertar(Session session, Coches co) {
    
        session.save(co);
    
    }

    public Coches getCoche(Session session, String matricula) {
  
        Query q=session.getNamedQuery("Coches.findByMatricula");
        q.setParameter("matricula", matricula);
        
        return (Coches)q.getSingleResult();
        
        
    }
    
}
