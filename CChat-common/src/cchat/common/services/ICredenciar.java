/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.common.services;

import cchat.common.model.domain.impl.Grupo;
import cchat.common.model.domain.impl.Usuario;

/**
 *
 * @author Aluno
 */
public interface ICredenciar {

    public boolean Logar(Usuario user);
    
    public boolean criarGrupo(Grupo group);

    public boolean convidar(Grupo group);

    public boolean sairGrupo(Grupo group);

}