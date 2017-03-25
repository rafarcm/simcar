package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "endereco", schema = "public", catalog = "fiapdb")
public class EnderecoEntity {
    private int cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String tipoLogradouro;

    @Id
    @Column(name = "cep")
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Basic
    @Column(name = "logradouro")
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Basic
    @Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Basic
    @Column(name = "cidade")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "tipo_logradouro")
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnderecoEntity that = (EnderecoEntity) o;

        if (cep != that.cep) return false;
        if (logradouro != null ? !logradouro.equals(that.logradouro) : that.logradouro != null) return false;
        if (bairro != null ? !bairro.equals(that.bairro) : that.bairro != null) return false;
        if (cidade != null ? !cidade.equals(that.cidade) : that.cidade != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (tipoLogradouro != null ? !tipoLogradouro.equals(that.tipoLogradouro) : that.tipoLogradouro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cep;
        result = 31 * result + (logradouro != null ? logradouro.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (tipoLogradouro != null ? tipoLogradouro.hashCode() : 0);
        return result;
    }
}
