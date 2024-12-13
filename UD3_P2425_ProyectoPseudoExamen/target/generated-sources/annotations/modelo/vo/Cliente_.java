package modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.Aloja;
import modelo.vo.Pais;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-13T19:37:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> codcli;
    public static volatile ListAttribute<Cliente, Aloja> alojaList;
    public static volatile SingularAttribute<Cliente, Pais> codpais;
    public static volatile SingularAttribute<Cliente, String> nombre;

}