/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.common.services;

import cchat.common.model.domain.impl.Mensagem;
import cchat.common.model.domain.impl.Usuario;

/**
 *
 * @author Nome
 */
public interface IMensageiro {
    public void send(Mensagem msg);
    public Mensagem get(Usuario user);
}