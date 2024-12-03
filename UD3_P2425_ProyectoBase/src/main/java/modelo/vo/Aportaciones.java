/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hector.garaboacasas
 */
@Entity
@Table(name = "aportaciones")
@NamedQueries({
    @NamedQuery(name = "Aportaciones.findAll", query = "SELECT a FROM Aportaciones a")})
public class Aportaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numemp")
    private Short numemp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private Float cantidad;

    public Aportaciones() {
    }

    public Aportaciones(Short numemp) {
        this.numemp = numemp;
    }

    public Short getNumemp() {
        return numemp;
    }

    public void setNumemp(Short numemp) {
        this.numemp = numemp;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numemp != null ? numemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aportaciones)) {
            return false;
        }
        Aportaciones other = (Aportaciones) object;
        if ((this.numemp == null && other.numemp != null) || (this.numemp != null && !this.numemp.equals(other.numemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.vo.Aportaciones[ numemp=" + numemp + " ]";
    }
    
}
