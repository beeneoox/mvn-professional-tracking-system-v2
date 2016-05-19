/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Bruno
 */
@Entity
public class Profissao implements Serializable {

    @Id
    private int id;

   // @ManyToMany(cascade = CascadeType.ALL)
    private List<Categoria> categorias;

    @OneToOne
    private Usuario usuario;

    @NotBlank
    @Length(min = 1, max = 200)
    private String descricaoProfissional;

    @NotBlank
    private String telefoneComercial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescricaoProfissional() {
        return descricaoProfissional;
    }

    public void setDescricaoProfissional(String descricaoProfissional) {
        this.descricaoProfissional = descricaoProfissional;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

}
