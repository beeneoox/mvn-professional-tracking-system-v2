/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.dao;

import com.dev2.model.Usuario;
import com.dev2.util.HashUtil;
import com.dev2.util.HibernateUtil;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Bruno
 */
public class UsuarioDAO {

    private final Session sessao;

    public UsuarioDAO() {
        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void cadastrar(Usuario usuario) {

        usuario.setSALT(Calendar.getInstance().getTime().toString() + "!@#$%*");
        usuario.setSenha(HashUtil.stringToMD5(usuario.getSenha() + usuario.getSALT()));
        Transaction t = sessao.beginTransaction();
        sessao.save(usuario);
        t.commit();
    }

}
