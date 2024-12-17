/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hector.garaboacasas
 */
@Entity
@Table(name = "aloja")
@NamedQueries({
    @NamedQuery(name = "Aloja.findAll", query = "SELECT a FROM Aloja a")})
public class Aloja implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlojaPK alojaPK;
    @Column(name = "fechasalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasalida;
    @Basic(optional = false)
    @Column(name = "numhabitaciones")
    private int numhabitaciones;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private Double importe;
    @JoinColumn(name = "codcliente", referencedColumnName = "codcli", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "codhotel", referencedColumnName = "codhotel", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;

    public Aloja() {
    }

    public Aloja(AlojaPK alojaPK) {
        this.alojaPK = alojaPK;
    }

    public Aloja(AlojaPK alojaPK, int numhabitaciones) {
        this.alojaPK = alojaPK;
        this.numhabitaciones = numhabitaciones;
    }

    public Aloja(String codcliente, String codhotel, Date fechaentrada) {
        this.alojaPK = new AlojaPK(codcliente, codhotel, fechaentrada);
    }

 
    

    public AlojaPK getAlojaPK() {
        return alojaPK;
    }

    public void setAlojaPK(AlojaPK alojaPK) {
        this.alojaPK = alojaPK;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public int getNumhabitaciones() {
        return numhabitaciones;
    }

    public void setNumhabitaciones(int numhabitaciones) {
        this.numhabitaciones = numhabitaciones;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alojaPK != null ? alojaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aloja)) {
            return false;
        }
        Aloja other = (Aloja) object;
        if ((this.alojaPK == null && other.alojaPK != null) || (this.alojaPK != null && !this.alojaPK.equals(other.alojaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.vo.Aloja[ alojaPK=" + alojaPK + " ]";
    }
    
}
