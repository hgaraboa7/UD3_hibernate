package modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.vo.Aloja;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-17T17:58:57", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile SingularAttribute<Hotel, Integer> habdisponibles;
    public static volatile SingularAttribute<Hotel, Double> preciohab;
    public static volatile ListAttribute<Hotel, Aloja> alojaList;
    public static volatile SingularAttribute<Hotel, String> codhotel;
    public static volatile SingularAttribute<Hotel, String> nomhotel;

}