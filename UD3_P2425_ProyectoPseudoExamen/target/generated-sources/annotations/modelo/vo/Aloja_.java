package modelo.vo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.AlojaPK;
import modelo.vo.Cliente;
import modelo.vo.Hotel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-13T19:37:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Aloja.class)
public class Aloja_ { 

    public static volatile SingularAttribute<Aloja, Cliente> cliente;
    public static volatile SingularAttribute<Aloja, AlojaPK> alojaPK;
    public static volatile SingularAttribute<Aloja, Integer> numhabitaciones;
    public static volatile SingularAttribute<Aloja, Date> fechasalida;
    public static volatile SingularAttribute<Aloja, Hotel> hotel;
    public static volatile SingularAttribute<Aloja, Double> importe;

}