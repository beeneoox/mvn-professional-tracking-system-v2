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

/**
 *
 * @author Bruno
 */
@Entity
public class Seguranca implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private Usuario usuario = new Usuario();
    private String SALT;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getSALT() {
        return SALT;
    }

    public void setSALT(String SALT) {
        this.SALT = SALT;
    }

    public String gerarSalt() {

        String sha512hex = org.apache.commons.codec.digest.DigestUtils.sha512Hex("123456");
//String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex("123456");
        System.out.println(sha512hex);

        return sha512hex;
    }
}
