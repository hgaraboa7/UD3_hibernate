/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.dao.DepartamentoDAO;
import org.hibernate.Session;
import vista.Principal;

/**
 *
 * @author acceso a datos
 */
public class controladorProyectoBase {
    //captura
    public static Session session;
    public static DepartamentoDAO depDAO;
    public static Principal ventana= new Principal();
    
    public static void iniciar(){
        
    }
    

}
