/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Bruno
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Length(min = 8, max = 100)
    private String nome;

    @Email
    private String email;

    @Length(min = 6)
    private String senha;

    private boolean profissional = false;

    @OneToOne
    private Endereco endereco;

    @Pattern(regexp = "[0-9]+")
    @Length(min = 8, max = 15)
    private String telefone;

    @CPF
    private String CPF;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isProfissional() {
        return profissional;
    }

    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
