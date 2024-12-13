/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hector.garaboacasas
 */
@Entity
@Table(name = "hotel")
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")})
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codhotel")
    private String codhotel;
    @Basic(optional = false)
    @Column(name = "nomhotel")
    private String nomhotel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preciohab")
    private Double preciohab;
    @Basic(optional = false)
    @Column(name = "habdisponibles")
    private int habdisponibles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
    private List<Aloja> alojaList;

    public Hotel() {
    }

    public Hotel(String codhotel) {
        this.codhotel = codhotel;
    }

    public Hotel(String codhotel, String nomhotel, int habdisponibles) {
        this.codhotel = codhotel;
        this.nomhotel = nomhotel;
        this.habdisponibles = habdisponibles;
    }

    public String getCodhotel() {
        return codhotel;
    }

    public void setCodhotel(String codhotel) {
        this.codhotel = codhotel;
    }

    public String getNomhotel() {
        return nomhotel;
    }

    public void setNomhotel(String nomhotel) {
        this.nomhotel = nomhotel;
    }

    public Double getPreciohab() {
        return preciohab;
    }

    public void setPreciohab(Double preciohab) {
        this.preciohab = preciohab;
    }

    public int getHabdisponibles() {
        return habdisponibles;
    }

    public void setHabdisponibles(int habdisponibles) {
        this.habdisponibles = habdisponibles;
    }

    public List<Aloja> getAlojaList() {
        return alojaList;
    }

    public void setAlojaList(List<Aloja> alojaList) {
        this.alojaList = alojaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codhotel != null ? codhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.codhotel == null && other.codhotel != null) || (this.codhotel != null && !this.codhotel.equals(other.codhotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomhotel;
    }
    
}
