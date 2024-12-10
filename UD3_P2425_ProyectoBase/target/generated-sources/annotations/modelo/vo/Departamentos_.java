package modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.Empleados;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-10T22:12:31", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, String> loc;
    public static volatile ListAttribute<Departamentos, Empleados> empleadosList;
    public static volatile SingularAttribute<Departamentos, Short> deptNo;
    public static volatile SingularAttribute<Departamentos, String> dnombre;

}