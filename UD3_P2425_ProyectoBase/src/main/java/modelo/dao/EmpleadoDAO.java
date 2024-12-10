/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author hector.garaboacasas
 */
public class EmpleadoDAO {

    public void cargarEmpleados(Session session, JTextArea ta, Departamentos dep, JLabel lblTotalEmp) {
   
        Empleados e;
        
        ta.setText("");
        lblTotalEmp.setText("");
        
        Query q= session.createQuery("from Empleados e where e.deptNo.deptNo=:deptno order by e.empNo");
    
        q.setParameter("deptno", dep.getDeptNo());
        Iterator it= q.list().iterator();
        
        if(!it.hasNext()){
            ta.append("no hay empleados");
        }
        while(it.hasNext()){
            e=(Empleados)it.next();
            ta.append(e.getApellido()+" "+e.getOficio()+"\n");
        }
        
        q=session.createQuery("select count(*) from Empleados e where e.deptNo.deptNo=:deptno");
        q.setParameter("deptno", dep.getDeptNo());
        
        long valor=(long) q.uniqueResult();
        lblTotalEmp.setText(String.valueOf(valor+""));
        
    }
    
}
