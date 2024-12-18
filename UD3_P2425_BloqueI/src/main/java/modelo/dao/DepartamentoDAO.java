/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import modelo.vo.Departamentos;
import modelo.vo.Empleados;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author acceso a datos
 */
public class DepartamentoDAO {

    public static void cargadatos(Session session, JTextArea ta) throws Exception {
    
        Departamentos d;

        //Importante
        //Consulta clásica: "select * from departamentos"; 
        //No funciona ni el * ni consultar con d(minuscula)epartamentos
        //se consulta a la clase que es con D(mayuscula)epartamentos
        //Cualqiuera de las 2 consultas funciona
        //String consulta="Select d from Departamentos d";
        //String consulta="from Departamentos d ";
        String consulta="Select d from Departamentos d";
        Query q=session.createQuery(consulta);
           
        Iterator it=q.list().iterator();
        while (it.hasNext()){
            d=(Departamentos) it.next();  //En este caso convierto cada elemento de la lista a departamento
            ta.append(d.getDeptNo() + " " + d.getDnombre() + " " + d.getLoc() + "\n");
        }
        //2.-opcion utilizando los namedquery que se han obtenido en la generación de las pojos.
        
//        String consultanamequery ="Departamentos.findAll"; //la sacamos del pojo del namedquery
//        Query q2=session.createNamedQuery(consultanamequery);
//        Iterator it2=q.list().iterator();
//        while (it2.hasNext()){
//            d=(Departamentos) it2.next();  //En este caso convierto cada elemento de la lista a departamento
//            ta.append(d.getDeptNo() + " " + d.getDnombre() + " " + d.getLoc() + "\n");
//        }
        
    }

    public void cargacombo(Session session, DefaultComboBoxModel modelocombo) throws Exception {
        Departamentos d;
        Query q = session.createQuery("from Departamentos d");

        List<Departamentos> listaDepartamentos = q.list(); //En este caso ya se pasa la consulta a lista de departamentos.
        Iterator it = listaDepartamentos.iterator();

        while (it.hasNext()) {
            modelocombo.addElement(it.next());
        }
    }
    public void mostrardatosEmpleadosentxtArea(Session session, Departamentos d, JTextArea ta, JLabel lblnumempleados) throws Exception {
        ta.setText("");
        //Opcion 1: Como en el objeto d ya está la lista de empleados. Ya no consultamos
//        if (d.getEmpleadosList().isEmpty())
//            ta.append("No hay empleados");
//        for (Empleados e : d.getEmpleadosList()) {
//              ta.append(e.getApellido()+" "+e.getOficio()+"\n");
//        }
//        lblnumempleados.setText("Numero Empleados: "+d.getEmpleadosList().size());
        //Opcion 2: Consultamos los empleados( el order by no es obligatorio) y no cuantos que lo recogemos de la lista.
        
//        Empleados e;
//     
//        Query q = session.createQuery("from Empleados e where e.departamentos.deptNo=:deptno order by e.id desc");
//
//        q.setParameter("deptno", d.getDeptNo());
//        Iterator it = q.list().iterator();
//
//        if (!it.hasNext()){
//            ta.append("No hay empleados");
//        }
//        while (it.hasNext()) {
//            e = (Empleados) it.next();
//            ta.append(e.getApellido() + " " + e.getOficio() + "\n");
//        }
//        lblnumempleados.setText("Numero Empleados: "+q.list().size());
//        
        //Opcion 3: Consultamos tanto los empleados como el número de empleados.
        Empleados e;
     
        //Si no hubieramos cambiado las clases de empleados/departamentos en 
        //@OneToMany(cascade = CascadeType.ALL, mappedBy = "deptNo")
        //a
        //@OneToMany(cascade = CascadeType.ALL, mappedBy = "departamentos")
        //La consulta sería lo cual entiendo que es más dificil de ver.
        //Query q = session.createQuery("from Empleados e where e.deptNo.deptNo=:deptno order by e.empNo");
        //
        
        Query q = session.createQuery("from Empleados e where e.departamentos.deptNo=:deptno order by e.empNo");

        q.setParameter("deptno", d.getDeptNo());
        Iterator it = q.list().iterator();

        if (!it.hasNext()){
            ta.append("No hay empleados");
        }
        while (it.hasNext()) {
            e = (Empleados) it.next();
            ta.append(e.getApellido() + " " + e.getOficio() + "\n");
        }
                
        q = session.createQuery("select count(*) from Empleados e where e.departamentos.deptNo=:deptno");
        q.setParameter("deptno", d.getDeptNo());
 	
        /*Debes tener en cuenta que un count devuelve un long. Lo que hacemos es recoger el resultado en un long y convertirlo
        * para mostrarlo ************/ 
        //observa que cuando devuelve un registro no lo recogemos como lista sino como uniqueResult();
        long valor= (long) q.uniqueResult();  
        lblnumempleados.setText(String.valueOf(valor+"")); 

    }

    public void mostrardatosEmpleadosentabla(Session session, Departamentos d, DefaultTableModel modelotabla) throws Exception{
        modelotabla.setRowCount(0);
        for (Empleados e : d.getEmpleadosList()) {
            modelotabla.setRowCount(modelotabla.getRowCount() + 1);
            modelotabla.setValueAt(e.getEmpNo(), modelotabla.getRowCount() - 1, 0);
            modelotabla.setValueAt(e.getApellido(), modelotabla.getRowCount() - 1, 1);
            modelotabla.setValueAt(e.getOficio(), modelotabla.getRowCount() - 1, 2);
            
        }
    }
    public Departamentos getDepartamento(Session session, short numdep) throws Exception{
        //importante. El get busca por la clave
        //Este tipo de búsqueda es directo sin consultar, pero solo busca la clave. (id)
         return session.get(Departamentos.class, numdep);
    }
    public Departamentos buscarDepartamento(Session session, short numdep) throws Exception{
        Departamentos d=null;
        Query q = session.createQuery("from Departamentos d where d.id=:numdep");

        q.setParameter("numdep", numdep);
        d=(Departamentos) q.uniqueResult(); /// como solo devuelve un valor uniqueResult
        return d;
    }
    
}
   



