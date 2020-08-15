/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james
 */
@Entity
@Table(name = "t_employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEmployee.findAll", query = "SELECT t FROM TEmployee t")
    , @NamedQuery(name = "TEmployee.findByIdEmployee", query = "SELECT t FROM TEmployee t WHERE t.idEmployee = :idEmployee")
    , @NamedQuery(name = "TEmployee.findByFullname", query = "SELECT t FROM TEmployee t WHERE t.fullname = :fullname")
    , @NamedQuery(name = "TEmployee.findByFunction", query = "SELECT t FROM TEmployee t WHERE t.function = :function")
    , @NamedQuery(name = "TEmployee.findByEsJefe", query = "SELECT t FROM TEmployee t WHERE t.esJefe = :esJefe")})
public class TEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "id_employee")
    private Integer idEmployee;
    @Size(max = 100)
    @Column(name = "fullname")
    private String fullname;
    @Size(max = 50)
    @Column(name = "function")
    private String function;
    @Basic(optional = false)
    @NotNull
    @Column(name = "es_jefe")
    private boolean esJefe;

    public TEmployee() {
    }

    public TEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public TEmployee(Integer idEmployee, boolean esJefe) {
        this.idEmployee = idEmployee;
        this.esJefe = esJefe;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public boolean getEsJefe() {
        return esJefe;
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmployee != null ? idEmployee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEmployee)) {
            return false;
        }
        TEmployee other = (TEmployee) object;
        if ((this.idEmployee == null && other.idEmployee != null) || (this.idEmployee != null && !this.idEmployee.equals(other.idEmployee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.TEmployee[ idEmployee=" + idEmployee + " ]";
    }
    
}
