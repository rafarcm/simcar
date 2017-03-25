package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "usuario", schema = "public", catalog = "fiapdb")
public class UsuarioEntity {
    private String email;
    private String senha;
    private String nome;
    private int cpf;
    private String imagem;
    private int digitoCpf;

    @Id
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "cpf")
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "imagem")
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (cpf != that.cpf) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (senha != null ? !senha.equals(that.senha) : that.senha != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (imagem != null ? !imagem.equals(that.imagem) : that.imagem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + cpf;
        result = 31 * result + (imagem != null ? imagem.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "digito_cpf")
    public int getDigitoCpf() {
        return digitoCpf;
    }

    public void setDigitoCpf(int digitoCpf) {
        this.digitoCpf = digitoCpf;
    }
}
