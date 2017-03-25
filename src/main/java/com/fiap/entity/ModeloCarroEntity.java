package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "modelo_carro", schema = "public", catalog = "fiapdb")
public class ModeloCarroEntity {
    private int id;
    private int descricao;
    private int marca;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "descricao")
    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "marca")
    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModeloCarroEntity that = (ModeloCarroEntity) o;

        if (id != that.id) return false;
        if (descricao != that.descricao) return false;
        if (marca != that.marca) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + descricao;
        result = 31 * result + marca;
        return result;
    }
}
