/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.controller;

import cchat.common.model.domain.impl.Mensagem;
import cchat.common.model.domain.impl.Sessao;
import cchat.common.services.IMensageiro;
import cchat.view.proxi.stubMensageiro;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author aluno
 */
public class mensagemIn {
    
    public static ArrayList<Mensagem> execute(HttpServletRequest request) {
        try {  
            IMensageiro mensageiro = new stubMensageiro();
            ArrayList<Mensagem> msg = mensageiro.get((Sessao) request.getSession().getAttribute("user"));
            
            return msg;
            
        } catch (Exception e) {
            return null;
        }        
    }
}
