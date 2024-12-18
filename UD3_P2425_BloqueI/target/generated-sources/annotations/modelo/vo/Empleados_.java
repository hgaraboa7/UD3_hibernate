package modelo.vo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.Departamentos;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-18T20:49:39", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> apellido;
    public static volatile SingularAttribute<Empleados, Float> salario;
    public static volatile SingularAttribute<Empleados, Departamentos> departamentos;
    public static volatile SingularAttribute<Empleados, Float> comision;
    public static volatile SingularAttribute<Empleados, Short> empNo;
    public static volatile SingularAttribute<Empleados, Short> dir;
    public static volatile SingularAttribute<Empleados, String> oficio;
    public static volatile SingularAttribute<Empleados, Date> fechaAlt;

}