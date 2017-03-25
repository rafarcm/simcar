package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "carro", schema = "public", catalog = "fiapdb")
public class CarroEntity {
    private int placa;
    private String email;
    private String chassi;
    private String imagem;
    private Integer marca;
    private int anoModelo;
    private int renavam;

    @Id
    @Column(name = "placa")
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "chassi")
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Basic
    @Column(name = "imagem")
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Basic
    @Column(name = "marca")
    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    @Basic
    @Column(name = "ano_modelo")
    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Basic
    @Column(name = "renavam")
    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarroEntity that = (CarroEntity) o;

        if (placa != that.placa) return false;
        if (anoModelo != that.anoModelo) return false;
        if (renavam != that.renavam) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (chassi != null ? !chassi.equals(that.chassi) : that.chassi != null) return false;
        if (imagem != null ? !imagem.equals(that.imagem) : that.imagem != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placa;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (chassi != null ? chassi.hashCode() : 0);
        result = 31 * result + (imagem != null ? imagem.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + anoModelo;
        result = 31 * result + renavam;
        return result;
    }
}
