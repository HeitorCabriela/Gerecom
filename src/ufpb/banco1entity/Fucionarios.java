/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb.banco1entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author Heitor
 * @param <Condominio>
 */
@Entity
@Table(name = "fucionarios")
@XmlRootElement
public class Fucionarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue
    @Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_cond")
    private Integer cod_cond;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "salario")
    private double salario;
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "cod_cond", referencedColumnName = "codigo", insertable = false, updatable = false)
    private Condominio condominio;

    public Fucionarios() {
    }

    public Fucionarios(Integer cod_cond) {
        this.cod_cond = cod_cond;
    }

    public Fucionarios(Integer id,Integer cod_cond, String nome, double salario, String cargo, String telefone) {
        this.cod_cond = cod_cond;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.telefone = telefone;
        this.id = id;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    
    
    public Integer getCod_cond() {
        return cod_cond;
    }

    public void setCod_cond(Integer cod_cond) {
        this.cod_cond = cod_cond;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_cond != null ? cod_cond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fucionarios)) {
            return false;
        }
        Fucionarios other = (Fucionarios) object;
        if ((this.cod_cond == null && other.cod_cond != null) || (this.cod_cond != null && !this.cod_cond.equals(other.cod_cond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Fucionarios[ matricula=" + cod_cond + " ]";
    }
    
}
