<%-- 
    Document   : adcionarmesas
    Created on : 22/04/2018, 20:26:16
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar nova mesa</title>
    </head>
    <body>
        <nav id ="menu">
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
        <h3>Digite o codigo da Mesa</h3>
        <input type="text" name="codigo da mesa" value="--" size="5" />
        <h3>Digite o codigo a descrição da mesa</h3>
        <input type="text" name="descrição da mesa" value="--" size="80" />
        <br>
        <a href="controlemesas.html"><input type="submit" value="adicionar mesa" name="btnAddMesa" /></a>
    </body>
</html>
