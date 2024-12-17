/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Date;
import modelo.vo.Aloja;
import modelo.vo.Cliente;
import modelo.vo.Hotel;
import org.hibernate.Session;

/**
 *
 * @author hector.garaboacasas
 */
public class AlojaDAO {

    public Aloja comprobar(Session session,Cliente cli, Hotel hotel, Integer numHab, Date date) {
 
        Aloja aloj=new Aloja(cli.getCodcli(), hotel.getCodhotel(), date);
        aloj.setNumhabitaciones(numHab);
       // calcular importe
       // aloj.setImporte();
        
        
        return aloj;
    }

//    public Aloja getAloja(Session session, Cliente cli) {
//  
//        session.get(type, cli)
//        
//        
//        
//    }
    
}
