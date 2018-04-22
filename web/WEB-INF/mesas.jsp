<%-- 
    Document   : mesasjsp
    Created on : 20/04/2018, 22:30:00
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mesas</title>
    </head>
    <body><nav id ="menu">
            <table border="1">
                <tr>
                    <th><a href="index.html">Página inicial</a></th>
                    <th><a href="produto.html">Cardapio</a></th>
                    <th><a href="mesas.html">Mesas</a></th>
                    <th><a href="controlemesas.html">Controle de Mesas</a></th>
                    <th><img src="imagens/FotoPrato.jpg" width="90"></th>
                </tr>
            </table>
        </nav>
        <hr>
        <h2>Selecione uma mesa</h2>
        <select name="Mesas">
            <option>XX</option>
            <option>XXX</option>
            <option>XXXX</option>
            
        </select>
        <table border="1">
            <thead>
                <tr>
                    <th>Numero da Mesa</th>
                    <th>Hora de abertura</th>
                    <th>Hora de fechamento</th>
                    <th>Stats</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>xx</td>
                    <td>18:00</td>
                    <td>--</td>
                    <td><input type="radio" name="" value="" checked="checked" disabled="disabled" /> </td>
                    <td><a href="fazerpedido.html"><input type="submit" value="Fazer Pedido" name="btnPedido" /></a></td>
                                        
                </tr>
            </tbody>
        </table>

        
        
    </body>
</html>
