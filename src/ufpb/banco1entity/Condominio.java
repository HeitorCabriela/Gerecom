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
@Table(name = "condominio")
@XmlRootElement
public class Condominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue
    @Id 
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "quant_res")
    private int quantRes;
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cidade idCidade;
    @SuppressWarnings("rawtypes")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "condominio")
    private List<Fucionarios> fucionarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCond")
    private List<Garagem> garagemList;
    @OneToMany(mappedBy = "idCond")
    private List<BalancoMensal> balancoMensalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCond")
    private List<Morador> moradorList;

    public Condominio() {
    }

    public Condominio(Integer codigo) {
        this.codigo = codigo;
    }

    public Condominio(Integer codigo, String nome, String endereco, int quantRes) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.quantRes = quantRes;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantRes() {
        return quantRes;
    }

    public void setQuantRes(int quantRes) {
        this.quantRes = quantRes;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }

    public List< Fucionarios> getFucionarios() {
        return  fucionarios;
    }

    public void setFucionarios(List <Fucionarios> fucionarios) {
        this.fucionarios = fucionarios;
    }

    @XmlTransient
    public List<Garagem> getGaragemList() {
        return garagemList;
    }

    public void setGaragemList(List<Garagem> garagemList) {
        this.garagemList = garagemList;
    }

    @XmlTransient
    public List<BalancoMensal> getBalancoMensalList() {
        return balancoMensalList;
    }

    public void setBalancoMensalList(List<BalancoMensal> balancoMensalList) {
        this.balancoMensalList = balancoMensalList;
    }

    @XmlTransient
    public List<Morador> getMoradorList() {
        return moradorList;
    }

    public void setMoradorList(List<Morador> moradorList) {
        this.moradorList = moradorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condominio)) {
            return false;
        }
        Condominio other = (Condominio) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Condominio[ codigo=" + codigo + " ]";
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
