/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author acceso a datos
 */
public class EmpleadoDAO {
    
    public void buscaempleadosporapellido(Session session, String apellido, JTextArea ta) {
        
        Empleados e;
        ta.setText("");
        //tambien se puede poner en una linea
        //Query q=session.createQuery(consulta).setParameter("ape",apellido.trim()+"%");
        
        String consulta = "from Empleados e where e.apellido like :ape";
        Query q = session.createQuery(consulta);
        q.setParameter("ape", apellido.trim() + "%");
        
        Iterator it = q.list().iterator();
        while (it.hasNext()) {
            e = (Empleados) it.next();
            ta.append(e.getEmpNo() + " " + e.getApellido() + " " + e.getOficio() + "\n");
        }
        
    }
    
    public void buscaempleadospordepartamento(Session session, Short numdep, JTextArea ta, JLabel lblnombreDepartamento, JLabel lblNumeroEmpleados) {
        
        String consulta = "from Departamentos d left join d.empleadosList e where d.deptNo=:numerodep";
        
        Query q = session.createQuery(consulta).setParameter("numerodep", numdep);
        
        Iterator it = q.list().iterator();

        //situar el numero de empleados
        if (it.hasNext()) {
            lblNumeroEmpleados.setText(String.valueOf(q.list().size())+" Empleado/s");
        } else {
            ta.setText("no existe el departamento");
            
        }
        
        while(it.hasNext()){
            //esta consulta devuelve por cada registro un objeto departamento y un objeto empleado
            //se recoge cada elemento en un vector de objetos, el primer objeto es el departamento 
            //y el segundo el empleado
            Object[]res= (Object[])it.next();
            Departamentos dep=(Departamentos)res[0];
            lblnombreDepartamento.setText(dep.getDnombre());
            Empleados emp=(Empleados)res[1];
            if(emp==null){
                //en este caso el departamento no tiene empleados
                ta.setText("no tiene empleados");
                lblNumeroEmpleados.setText("0 Empleados");
            }else{
                ta.append(emp.getEmpNo()+" "+emp.getApellido()+"\n");
            }
            
        }
        
    }
    
    public void salariospordepartamento(Session session, JTextArea ta, JLabel lblNumeroDepartamentos) {
   
        //no recogemos objetos en este caso, solo campos sueltos, los recogemos en un vector de objetos
        //el primer campo es el nombre y el segundo el salario
        String consulta="select d.dnombre,sum(e.salario) from Departamentos d left join d.empleadosList e group by d.deptNo";
        Query q=session.createQuery(consulta);
        
        lblNumeroDepartamentos.setText("Departamentos-->"+String.valueOf(q.list().size()));
        
        Iterator it=q.list().iterator();
        while(it.hasNext()){
            //esta consulta resuelve por cada registro un conjunto de datos.
            //los podemos encontrar en cada elemnto del vector no necesitamos castearlo a la clase
            
            Object[] res=(Object[])it.next();
            //si hacemos un sumatorio de un departamento que no existe el valor que devuelve es null, no 0
            //por eso le indicamos que si devuelve null que realmente devuelva 0 y si no el valor
            
            double valor=((res[1]==null)? 0.0:(double)res[1]);
            ta.append(res[0]+"\t"+valor+"\n");
            
            
        }
        
    }
    
    public void empleadosdeferrolysantiago(Session session, JTextArea ta, JLabel lblNumeroEmpleados) {
   
        //Ejemplo de consulta donde el parametro que se pasa no es un valor, si no otra consulta
        String consultalocalidades="from departamentos d where loc in('Santiago','Ferrol')";
        Query q=session.createQuery(consultalocalidades);
        
        List<Object> localidades=new ArrayList<>();
        //La primera consulta la incorporamos a una lista que sera el parametro para la segunda
        
        for(Object o:q.list()){
            Departamentos dep=(Departamentos)o;
            localidades.add(dep.getDeptNo());
        }
        
        //cualquiera de las 2 consultas vale
        //String consulta="from Departamentos d inner join d.empleadosList where d.deptNo in :listdep";
        String consulta="from Departamentos d,Empleados e where d.deptNo=e.departamentos.deptNo and d.deptNo in :listdep";
        Query q2=session.createQuery(consulta);
       // q2.setp
        
    }
    
}
