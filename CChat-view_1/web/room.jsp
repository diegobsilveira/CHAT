<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cchat.common.model.domain.impl.*" %>


<html lang="en"><head>
        <meta charset="utf-8">
        <title>CHAT</title>
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="css.css">
        <style>
            ::-webkit-input-placeholder {
                color: gainsboro;
            }
        </style> 

        <style type="text/css"></style><style type="text/css"></style><style type="text/css"></style><style type="text/css"></style>
        <script src="//twemoji.maxcdn.com/twemoji.min.js"></script>
        <script type="text/javascript" src="script.js"></script>
        <style type="text/css"></style><style type="text/css"></style><style type="text/css"></style><style type="text/css"></style></head>

    <body class="html" style="
          background: #7000ec; /* Old browsers */
          /* FF3.6-15 */
          /* Chrome10-25,Safari5.1-6 */
          /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
          background: -webkit-linear-gradient(top, rgb(98, 0, 207) 0%, rgba(69,0,126,1) 100%);">

        <div class="you">
            VOCÊ É: 
            <span id="nickname"> <%= request.getParameter("nick")%> </span>            
        </div>
        
        <form id="form" action="/chat/servletweb?acao=Login" method="POST">
        <div class="container">
            <div class="msgdiv">
                <div style="padding: 20px; border-bottom: 1px solid gainsboro;">
                    <h3 style="color: #7000ec;">GALERA DO WUKONG</h3>
                    <a href="" style="background: url(&quot;https://cdn4.iconfinder.com/data/icons/geomicons/32/672366-x-128.png&quot;);height: 12px;width: 12px;position: absolute;top: 24px;right: 30px;background-size: cover;"></a>
                </div>

                <div class="body">
                    <ul>
                        <% 
                            // ? = request.getParameter("msgList");
                            for (int i = 0; i < 100; i++) { %>
                        <li class="msg">
                            <h4 id="remetente">?</h4>
                            <span id="mensagem">A GAKONG DO WULERA CHEFIM AO GOU</span>
                        </li>
                        <% }%>

                        <li class="msg">
                            <h4 id="remetente">Wukong</h4>
                            <span id="mensagem">A minha galera chegou ao fim</span>
                        </li>

                    </ul>
                </div>

                <div>
                    <input placeholder="Digite aqui sua mensagem" type="text" class="box">
                    <button onclick="envia()" id="botao" class="sendbutton">ENVIAR
                    </button>
                </div>
            </div>
                        
            <div class="nav">
                <div class="salas" style="border-bottom: 1px solid gainsboro;">
                    <h2>GRUPO</h2>
                    <ul>
                        <% 
                            // ? = request.getParameter("grpList");
                            
                            for (int i = 0; i < 10; i++) { %>
                        <li>
                            <a id="<%= "a" %> ">GRUPO <%= i+1 %></a>
                        </li>
                        <% }%>
                    </ul>
                </div>

                <div class="salas"><h2>PESSOAS</h2><ul>
                        <%
                             // ? = request.getParameter("usrList");
                            for (int i = 0; i < 10; i++) { %>
                        <li>
                            <a id="<%= "a" %> ">PESSOA <%= i+1 %></a>
                        </li>
                        <% }%>
                    </ul>
                </div>
            </div>
        </div>
        </form>            
    </body></html>