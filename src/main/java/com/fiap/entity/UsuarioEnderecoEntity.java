package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "usuario_endereco", schema = "public", catalog = "fiapdb")
@IdClass(UsuarioEnderecoEntityPK.class)
public class UsuarioEnderecoEntity {
    private String numero;
    private String complemento;
    private String email;
    private int cep;

    @Basic
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Id
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @Column(name = "cep")
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEnderecoEntity that = (UsuarioEnderecoEntity) o;

        if (cep != that.cep) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (complemento != null ? !complemento.equals(that.complemento) : that.complemento != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numero != null ? numero.hashCode() : 0;
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + cep;
        return result;
    }
}
