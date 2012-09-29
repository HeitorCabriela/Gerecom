/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb.banco1entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "garagem")
@XmlRootElement
public class Garagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero")
    private Integer numero;
    @JoinColumn(name = "id_morador", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Morador idMorador;
    @JoinColumn(name = "cod_cond", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Condominio codCond;

   
    
      public Garagem(Integer id, Integer numero, Morador idMorador,
			Condominio codCond) {
		super();
		this.id = id;
		this.numero = numero;
		this.idMorador = idMorador;
		this.codCond = codCond;
	}



	public Garagem() {
    }
    
    
    
    public Integer getId() {
  		return id;
  	}

  	public void setId(Integer id) {
  		this.id = id;
  	}


    public Garagem(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Morador getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Morador idMorador) {
        this.idMorador = idMorador;
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
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garagem)) {
            return false;
        }
        Garagem other = (Garagem) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Garagem[ numero=" + numero + " ]";
    }
    
}
