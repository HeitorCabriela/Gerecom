/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb.banco1entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "morador")
@XmlRootElement
public class Morador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "n_resd")
    private String nResd;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String telefone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMorador")
    private List<Boleto> boletoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMorador")
    private List<Garagem> garagemList;
    @JoinColumn(name = "cod_cond", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Condominio codCond;

    public Morador() {
    }

    public Morador(Integer id) {
        this.id = id;
    }

    public Morador(Integer id, String nome, String nResd) {
        this.id = id;
        this.nome = nome;
        this.nResd = nResd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNResd() {
        return nResd;
    }

    public void setNResd(String nResd) {
        this.nResd = nResd;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlTransient
    public List<Boleto> getBoletoList() {
        return boletoList;
    }

    public void setBoletoList(List<Boleto> boletoList) {
        this.boletoList = boletoList;
    }

    @XmlTransient
    public List<Garagem> getGaragemList() {
        return garagemList;
    }

    public void setGaragemList(List<Garagem> garagemList) {
        this.garagemList = garagemList;
    }

    public Condominio getCodCond() {
        return codCond;
    }

    public void setCodCond(Condominio codCond) {
        this.codCond = codCond;
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
        if (!(object instanceof Morador)) {
            return false;
        }
        Morador other = (Morador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Morador[ id=" + id + " ]";
    }
    
}
