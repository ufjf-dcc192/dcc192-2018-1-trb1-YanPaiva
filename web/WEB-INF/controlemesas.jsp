<%-- 
    Document   : controlemesasjsp
    Created on : 22/04/2018, 14:11:44
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Mesas</title>
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
        <table border="1">
            <thead>
                <tr>
                    <th>Numero da Mesa</th>
                    <th>Consumo</th>
                    <th>Mesa disponivel</th>
                    <th>Pedir Conta</th>
                    <th>Excluir Mesa</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>01</td>
                    <td>R$500,00</td>
                    <td> <input type="radio" name="" value="xx" checked="checked" disabled="disabled" /></td>
                    <td><input type="submit" value="Fechar Mesa" name="btnFechar" /></td>
                    <td><input type="submit" value="Excluir Mesa" name="btnExcluirMesa" /></td>    
                </tr>
                <tr>
                    <td>01</td>
                    <td>R$500,00</td>
                    <td> <input type="radio" name="" value="xx" checked="checked" disabled="disabled" /></td>
                    <td><input type="submit" value="Fechar Mesa" name="btnFechar" /></td>
                    <td><input type="submit" value="Excluir Mesa" name="btnExcluirMesa" /></td>    
                </tr>
                <tr>
                    <td>01</td>
                    <td>R$500,00</td>
                    <td> <input type="radio" name="" value="xx" checked="checked" disabled="disabled" /></td>
                    <td><input type="submit" value="Fechar Mesa" name="btnFechar" /></td>
                    <td><input type="submit" value="Excluir Mesa" name="btnExcluirMesa" /></td>    
                </tr>
                <tr>
                    <td>01</td>
                    <td>R$500,00</td>
                    <td> <input type="radio" name="" value="xx" checked="checked" disabled="disabled" /></td>
                    <td><input type="submit" value="Fechar Mesa" name="btnFechar" /></td>
                    <td><input type="submit" value="Excluir Mesa" name="btnExcluirMesa" /></td>    
                </tr>
                <tr>
                    <td>01</td>
                    <td>R$500,00</td>
                    <td> <input type="radio" name="" value="xx" checked="checked" disabled="disabled" /></td>
                    <td><input type="submit" value="Fechar Mesa" name="btnFechar" /></td>
                    <td><input type="submit" value="Excluir Mesa" name="btnExcluirMesa" /></td>    
                </tr>
                <tr>
                    <td colspan="5"><a href="adcionarmesas.html"><input type="submit" 
                                                                value="Adicionar nova mesa" 
                                                                name="btnAddMesa" /></a></td>
                </tr>                
            </tbody>
        </table>

    </body>
</html>
