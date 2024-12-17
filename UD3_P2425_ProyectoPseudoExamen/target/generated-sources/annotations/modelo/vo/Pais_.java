package modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-17T17:58:57", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile ListAttribute<Pais, Cliente> clienteList;
    public static volatile SingularAttribute<Pais, Double> descuento;
    public static volatile SingularAttribute<Pais, Short> codpais;
    public static volatile SingularAttribute<Pais, String> pais;
    public static volatile SingularAttribute<Pais, Integer> operativas;

}