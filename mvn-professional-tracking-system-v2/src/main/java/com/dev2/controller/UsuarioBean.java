/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.controller;

import com.dev2.dao.CategoriaDAO;
import com.dev2.dao.EnderecoDAO;
import com.dev2.dao.ProfissaoDAO;
import com.dev2.dao.UsuarioDAO;
import com.dev2.model.Categoria;
import com.dev2.model.Endereco;
import com.dev2.model.Profissao;
import com.dev2.model.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Bruno
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable {

    private Usuario usuario;
    private UsuarioDAO usuarioDAO;
    private Endereco endereco;
    private EnderecoDAO enderecoDAO;
    private Profissao profissao;
    private ProfissaoDAO profissaoDAO;
    private Categoria categoria;
    private CategoriaDAO categoriaDAO;

    public UsuarioBean() {
        /*this.usuario = new Usuario();
        this.usuarioDAO = new UsuarioDAO();
        this.endereco = new Endereco();
        this.enderecoDAO = new EnderecoDAO();
        this.profissao = new Profissao();
        this.profissaoDAO = new ProfissaoDAO();
        this.categoria = new Categoria();
        this.categoriaDAO = new CategoriaDAO();*/
    }

    public void cadastrarUsuario() {
        this.enderecoDAO = new EnderecoDAO();
        this.enderecoDAO.incluir(endereco);
        this.usuario.setEndereco(enderecoDAO.carregar(this.endereco.getId()));
        this.usuarioDAO.cadastrar(this.usuario);

        /*public String incluir() {
        this.enderecoDAO = new EnderecoDAO();
        this.enderecoDAO.incluir(endereco);
        this.cliente.setEndereco(enderecoDAO.carregar(this.endereco.getId()));
        clienteDAO.incluir(cliente);
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, new FacesMessage("Cliente Cadastrado!", ""));
        this.cliente = new Cliente();
        this.endereco = new Endereco();
        listaClientes = clienteDAO.listar();
        return "index?faces-redirect=true";
    }*/
    }

    public boolean renderedPainelProfissional() {
        return this.usuario.isTemPainelProfissionall();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public EnderecoDAO getEnderecoDAO() {
        return enderecoDAO;
    }

    public void setEnderecoDAO(EnderecoDAO enderecoDAO) {
        this.enderecoDAO = enderecoDAO;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public ProfissaoDAO getProfissaoDAO() {
        return profissaoDAO;
    }

    public void setProfissaoDAO(ProfissaoDAO profissaoDAO) {
        this.profissaoDAO = profissaoDAO;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public CategoriaDAO getCategoriaDAO() {
        return categoriaDAO;
    }

    public void setCategoriaDAO(CategoriaDAO categoriaDAO) {
        this.categoriaDAO = categoriaDAO;
    }

}
