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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hector.garaboacasas
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codcli")
    private String codcli;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "codpais", referencedColumnName = "codpais")
    @ManyToOne
    private Pais codpais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Aloja> alojaList;

    public Cliente() {
    }

    public Cliente(String codcli) {
        this.codcli = codcli;
    }

    public Cliente(String codcli, String nombre) {
        this.codcli = codcli;
        this.nombre = nombre;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getCodpais() {
        return codpais;
    }

    public void setCodpais(Pais codpais) {
        this.codpais = codpais;
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
        hash += (codcli != null ? codcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codcli+" "+nombre;
    }
    
}
