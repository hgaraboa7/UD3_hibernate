/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hector.garaboacasas
 */
@Embeddable
public class AlojaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codcliente")
    private String codcliente;
    @Basic(optional = false)
    @Column(name = "codhotel")
    private String codhotel;
    @Basic(optional = false)
    @Column(name = "fechaentrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentrada;

    public AlojaPK() {
    }

    public AlojaPK(String codcliente, String codhotel, Date fechaentrada) {
        this.codcliente = codcliente;
        this.codhotel = codhotel;
        this.fechaentrada = fechaentrada;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getCodhotel() {
        return codhotel;
    }

    public void setCodhotel(String codhotel) {
        this.codhotel = codhotel;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcliente != null ? codcliente.hashCode() : 0);
        hash += (codhotel != null ? codhotel.hashCode() : 0);
        hash += (fechaentrada != null ? fechaentrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlojaPK)) {
            return false;
        }
        AlojaPK other = (AlojaPK) object;
        if ((this.codcliente == null && other.codcliente != null) || (this.codcliente != null && !this.codcliente.equals(other.codcliente))) {
            return false;
        }
        if ((this.codhotel == null && other.codhotel != null) || (this.codhotel != null && !this.codhotel.equals(other.codhotel))) {
            return false;
        }
        if ((this.fechaentrada == null && other.fechaentrada != null) || (this.fechaentrada != null && !this.fechaentrada.equals(other.fechaentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.vo.AlojaPK[ codcliente=" + codcliente + ", codhotel=" + codhotel + ", fechaentrada=" + fechaentrada + " ]";
    }
    
}
