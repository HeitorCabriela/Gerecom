/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb.banco1entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "boleto")
@XmlRootElement
public class Boleto implements Serializable {
    private static final long serialVersionUID = 1L;
   @GeneratedValue
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @Column(name = "data_")
    private String data;
    @Basic(optional = false)
    @Column(name = "data_venc")
    private String dataVenc;
    @JoinColumn(name = "id_banco", referencedColumnName = "id")
    @ManyToOne
    private Banco idBanco;
    @JoinColumn(name = "id_balanco", referencedColumnName = "id")
    @ManyToOne
    private BalancoMensal idBalanco;
    @JoinColumn(name = "id_morador", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Morador idMorador;

    public Boleto() {
    }

    public Boleto(Integer id) {
        this.id = id;
    }

    public Boleto(Integer id, double valor, String data, String dataVenc) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.dataVenc = dataVenc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String string) {
        this.data = string;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String string) {
        this.dataVenc = string;
    }

    public Banco getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Banco idBanco) {
        this.idBanco = idBanco;
    }

    public BalancoMensal getIdBalanco() {
        return idBalanco;
    }

    public void setIdBalanco(BalancoMensal idBalanco) {
        this.idBalanco = idBalanco;
    }

    public Morador getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Morador idMorador) {
        this.idMorador = idMorador;
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
        if (!(object instanceof Boleto)) {
            return false;
        }
        Boleto other = (Boleto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Boleto[ id=" + id + " ]";
    }
    
}
