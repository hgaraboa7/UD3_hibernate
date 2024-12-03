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
@Table(name = "historicos")
@NamedQueries({
    @NamedQuery(name = "Historicos.findAll", query = "SELECT h FROM Historicos h")})
public class Historicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "hdept_no")
    private Integer hdeptNo;
    @Column(name = "hdnombre")
    private String hdnombre;
    @Column(name = "hloc")
    private String hloc;
    @Column(name = "sumsal")
    private Integer sumsal;

    public Historicos() {
    }

    public Historicos(Integer hdeptNo) {
        this.hdeptNo = hdeptNo;
    }

    public Integer getHdeptNo() {
        return hdeptNo;
    }

    public void setHdeptNo(Integer hdeptNo) {
        this.hdeptNo = hdeptNo;
    }

    public String getHdnombre() {
        return hdnombre;
    }

    public void setHdnombre(String hdnombre) {
        this.hdnombre = hdnombre;
    }

    public String getHloc() {
        return hloc;
    }

    public void setHloc(String hloc) {
        this.hloc = hloc;
    }

    public Integer getSumsal() {
        return sumsal;
    }

    public void setSumsal(Integer sumsal) {
        this.sumsal = sumsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hdeptNo != null ? hdeptNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historicos)) {
            return false;
        }
        Historicos other = (Historicos) object;
        if ((this.hdeptNo == null && other.hdeptNo != null) || (this.hdeptNo != null && !this.hdeptNo.equals(other.hdeptNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.vo.Historicos[ hdeptNo=" + hdeptNo + " ]";
    }
    
}
