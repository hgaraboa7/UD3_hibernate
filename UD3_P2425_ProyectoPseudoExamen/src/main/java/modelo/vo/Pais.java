/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "pais")
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p")})
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codpais")
    private Short codpais;
    @Column(name = "pais")
    private String pais;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "operativas")
    private Integer operativas;
    @OneToMany(mappedBy = "codpais")
    private List<Cliente> clienteList;

    public Pais() {
    }

    public Pais(Short codpais) {
        this.codpais = codpais;
    }

    public Short getCodpais() {
        return codpais;
    }

    public void setCodpais(Short codpais) {
        this.codpais = codpais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Integer getOperativas() {
        return operativas;
    }

    public void setOperativas(Integer operativas) {
        this.operativas = operativas;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpais != null ? codpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.codpais == null && other.codpais != null) || (this.codpais != null && !this.codpais.equals(other.codpais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.vo.Pais[ codpais=" + codpais + " ]";
    }
    
}
