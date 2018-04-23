<%-- 
    Document   : fazerPedido
    Created on : 22/04/2018, 18:31:37
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
        <hr>
        <table border="1">
            <thead>
                <tr>
                    <th>Selecione o item</th>
                    <th>Quantidade</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><select name="" >
                            <option>yy</option>
                            <option>yy</option>
                            <option>yyy</option>
                            <option>yyyx</option>
                            <option>yxxyxy</option>
                        </select></td>
                        <td><input type="text" name="Quantidade" value="--" size="100" /></td>
                        <td><input type="submit" value="Adicionar ao pedido" name="btnAdicionarPedido" /></td>
                </tr>           
                
            </tbody>
        
        </table>
        <hr>
        <ul type="circle">
            <li>pedido 1</li>
            <li>pedido 2</li>
        </ul>
        <input type="submit" value="Fechar Pedido" name="btnFecharPedido" />
<%@include file="../jspf/footerjsp.jsp" %>
