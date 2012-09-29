/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb.banco1entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "balanco_mensal")
@XmlRootElement

public class BalancoMensal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "data")
    private String data;
    @GeneratedValue
    @Id
    private Integer id;
    @OneToMany(mappedBy = "idBalanco")
    private List<Boleto> boletoList;
    @OneToMany(mappedBy = "idBalanco")
    private List<Despesas> despesasList;
    @JoinColumn(name = "id_cond", referencedColumnName = "codigo")
    @ManyToOne
    private Condominio idCond;

    public BalancoMensal() {
    }

    public BalancoMensal(Integer id) {
        this.id = id;
    }

    public BalancoMensal(Integer id, double total, String status, String data) {
        this.id = id;
        this.total = total;
        this.status = status;
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String string) {
        this.data = string;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<Boleto> getBoletoList() {
        return boletoList;
    }

    public void setBoletoList(List<Boleto> boletoList) {
        this.boletoList = boletoList;
    }

    @XmlTransient
    public List<Despesas> getDespesasList() {
        return despesasList;
    }

    public void setDespesasList(List<Despesas> despesasList) {
        this.despesasList = despesasList;
    }

    public Condominio getIdCond() {
        return idCond;
    }

    public void setIdCond(Condominio idCond) {
        this.idCond = idCond;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BalancoMensal)) {
            return false;
        }
        BalancoMensal other = (BalancoMensal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.BalancoMensal[ id=" + id + " ]";
    }
    
}
