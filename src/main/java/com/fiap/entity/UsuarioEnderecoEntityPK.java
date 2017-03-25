package com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by logonrm on 25/03/2017.
 */
public class UsuarioEnderecoEntityPK implements Serializable {
    private String email;
    private int cep;

    @Column(name = "email")
    @Id
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cep")
    @Id
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

        UsuarioEnderecoEntityPK that = (UsuarioEnderecoEntityPK) o;

        if (cep != that.cep) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + cep;
        return result;
    }
}
