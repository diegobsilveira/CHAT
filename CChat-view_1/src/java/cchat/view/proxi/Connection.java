/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cchat.view.proxi;

import java.io.IOException;
import java.net.Socket;

public class Connection {
    private static String serverAddress = "localhost";
    private static int serverPort = 2223;
    private static Socket socket;
    
    private Connection() {
    }
    
    public static Socket connect () throws IOException{
        if(socket == null){
            socket = new Socket(serverAddress, serverPort);
        }
        return socket;
    }
}
