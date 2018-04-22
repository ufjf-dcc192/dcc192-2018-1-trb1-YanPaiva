<%-- 
    Document   : produtojsp
    Created on : 20/04/2018, 22:30:23
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cardapio</title>
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
                    <th>Codigo</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Preço</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>01</td>
                    <td>Coca-cola</td>
                    <td>Refrigerante do tipo cola</td>
                    <td>R$ 5,50</td>
                    
                </tr>
                <tr>
                    <td>02</td>
                    <td>Sprite</td>
                    <td>Refrigerante do tipo Limão</td>
                    <td>R$ 6,50</td>
                </tr>
                
                <tr>
                    <td>03</td>
                    <td>Suco</td>
                    <td>suco de Limão</td>
                    <td>R$ 6,50</td>
                </tr>
                
                <tr>
                    <td>04</td>
                    <td>Suco</td>
                    <td>Suco de Laranja</td>
                    <td>R$ 6,50</td>
                </tr>
                
                <tr>
                    <td>01</td>
                    <td>Suco</td>
                    <td>Suco de Abacachi</td>
                    <td>R$ 6,50</td>
                </tr>
                
                    
            </tbody>
        </table>

    </body>
</html>
