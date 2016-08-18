/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.core;

import cchat.core.skeleton.msgSkeleton;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aluno
 */
public class CChatCore {

    public static void main (String args[]) throws IOException {
        
        ServerSocket server = null;
        
        try {
            server = new ServerSocket(2223);

            while(true) {
                Socket socket = server.accept();
                msgSkeleton mensageiro = new msgSkeleton(socket);
                Thread t = new Thread(mensageiro);
                t.start();
            }
        }
        catch(Exception e) {
            if (server != null)
                server.close();
        }
    }
}