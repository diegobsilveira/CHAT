/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.common.services;

import cchat.common.model.domain.impl.*;
import java.util.ArrayList;

/**
 *
 * @author Nome
 */
public interface IManterGrupo {
    
    public boolean adicionar(Grupo group, Sessao user);

    public boolean criarGrupo(Grupo group);
    
    public boolean sairGrupo(Grupo group);
    
    public ArrayList<String> listarGrupos();
    public ArrayList<String> listarGruposDoUsuario(Sessao user);
}
