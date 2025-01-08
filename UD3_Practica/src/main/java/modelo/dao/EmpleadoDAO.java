/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import modelo.vo.Empleados;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author hecto
 */
public class EmpleadoDAO {

    public Empleados getEmpleado(Session session, String nombre) {
  
        Query q=session.createNamedQuery("Empleados.findByNomemp");
        q.setParameter("nomemp", nombre);
        
        return (Empleados)q.getSingleResult();
    }
    
}
