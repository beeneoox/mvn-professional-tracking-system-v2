/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.controller;

import com.dev2.dao.EnderecoDAO;
import com.dev2.dao.UsuarioDAO;
import com.dev2.model.Endereco;
import com.dev2.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Bruno
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable {

    private Usuario usuario = new Usuario();
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private Endereco endereco = new Endereco();
    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    public String cadastrar() {

        /*this.enderecoDAO = new EderecoDAO();
         this.endereco = enderecoDAO.carregar(idCategoria);
         this.profissional.setCategoria(categoria);
         this.profissionalDAO.incluir(profissional);*/
        this.enderecoDAO = new EnderecoDAO();
        this.enderecoDAO.incluir(endereco);
        this.usuario.setEndereco(enderecoDAO.carregar(this.endereco.getId()));
        usuarioDAO.cadastrar(usuario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "USUARIO CADASTRADO", ""));
        this.usuario = new Usuario();
        this.endereco = new Endereco();
        return null;
    }

    public String deletar(int id) {
        this.usuarioDAO.deletar(id);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "USUARIO EXCLUIDO", ""));
        getListaUsuarios();
        return null;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        this.usuarioDAO = new UsuarioDAO();
        return usuarioDAO.listarUsuarios();
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

}
