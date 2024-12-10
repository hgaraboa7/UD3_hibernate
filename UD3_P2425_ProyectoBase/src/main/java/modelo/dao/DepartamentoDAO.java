/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JTextArea;

import modelo.vo.Departamentos;
import org.hibernate.Session;
import org.hibernate.query.Query;


/**
 *
 * @author hector.garaboacasas
 */
public class DepartamentoDAO {

    public void cargardatos(Session session, JTextArea ta)throws Exception {
   
        Departamentos d;
        
        String consulta="Select d from Departamentos d";
        Query q=session.createQuery(consulta);
        
        Iterator it=q.list().iterator();
        while(it.hasNext()){
            d=(Departamentos)it.next();
            ta.append(d.getDeptNo()+" "+d.getDnombre()+" "+d.getLoc()+"\n");
        }
        
    }
    
//captura1.2
    


    public void cargarCombo(Session session, DefaultComboBoxModel modelocombo) {
  
        modelocombo.removeAllElements();
        //Departamentos d;
        Query q=session.createQuery("Select d from Departamentos d");
        
        List<Departamentos> listaDepartamentos=q.list();
        Iterator it=listaDepartamentos.iterator();
        
        while(it.hasNext()){
            modelocombo.addElement(it.next());
        }
        
    }

   
     
   

    public Departamentos getDepartamento(Session session, Short numdep) {
    
        return session.get(Departamentos.class, numdep);
        
    }
    
     //ejercicio 4 insertar modificar y borrar

    public void insertar(Session session, Short numdep, String loc, String nombre) {
   
        //crear primero constructor en el modelo
        Departamentos d=new Departamentos(numdep,nombre,loc);
        session.save(d);
    }
    
    
    

}
