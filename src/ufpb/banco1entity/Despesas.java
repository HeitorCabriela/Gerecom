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
 * @param <BalancoMensal>
 */
@Entity
@Table(name = "despesas")
@XmlRootElement
public class Despesas implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue
    @Id
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo_ant")
    private Double saldoAnt;
    @Column(name = "folha_pagamento_func")
    private Double folhaPagamentoFunc;
    @Column(name = "desp_agua")
    private Double despAgua;
    @Column(name = "desp_luz")
    private Double despLuz;
    @Column(name = "sinteg")
    private Double sinteg;
    @Column(name = "total_despesas")
    private Double totalDespesas;
    @Column(name = "total_receita")
    private Double totalReceita;
    @Column(name = "saldo_banc")
    private Double saldoBanc;
   
    @ManyToOne
    @JoinColumn(name = "id_balanco", referencedColumnName = "id")
    private BalancoMensal idBalanco;

    public Despesas() {
    }

    public Despesas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldoAnt() {
        return saldoAnt;
    }

    public void setSaldoAnt(Double saldoAnt) {
        this.saldoAnt = saldoAnt;
    }

    public Double getFolhaPagamentoFunc() {
        return folhaPagamentoFunc;
    }

    public void setFolhaPagamentoFunc(Double folhaPagamentoFunc) {
        this.folhaPagamentoFunc = folhaPagamentoFunc;
    }

    public Double getDespAgua() {
        return despAgua;
    }

    public void setDespAgua(Double despAgua) {
        this.despAgua = despAgua;
    }

    public Double getDespLuz() {
        return despLuz;
    }

    public void setDespLuz(Double despLuz) {
        this.despLuz = despLuz;
    }

    public Double getSinteg() {
        return sinteg;
    }

    public void setSinteg(Double sinteg) {
        this.sinteg = sinteg;
    }

    public Double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(Double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public Double getTotalReceita() {
        return totalReceita;
    }

    public void setTotalReceita(Double totalReceita) {
        this.totalReceita = totalReceita;
    }

    public Double getSaldoBanc() {
        return saldoBanc;
    }

    public void setSaldoBanc(Double saldoBanc) {
        this.saldoBanc = saldoBanc;
    }

    public BalancoMensal getIdBalanco() {
        return idBalanco;
    }

    public void setIdBalanco(BalancoMensal idBalanco) {
        this.idBalanco = idBalanco;
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
        if (!(object instanceof Despesas)) {
            return false;
        }
        Despesas other = (Despesas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Despesas[ id=" + id + " ]";
    }
    
}
