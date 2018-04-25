<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : fazerPedido
    Created on : 22/04/2018, 18:31:37
    Author     : YanNotebook
--%>
<%@page import="DCC192.ufjf.br.Dados.Estoque"%>
<%@page import="DCC192.ufjf.br.Dados.Itens"%>

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
        <form method="post">
                    <td><select name="pedidos" >
                        <c:forEach var="est" items="${estoque}">
                            <option>${est.getNome()}</option>
                        </c:forEach>
                        </select></td>
                    
                        <td><input type="number" name="Quantidade" value="0" size="100" /></td>
                    <td><input type="submit" value="Adicionar ao pedido" name="btnAdicionarPedido" /></td>
        </form>
                </tr>           
            </tbody>
        
            </table>
        <hr>
        <ul type="circle">
            <%if((request.getAttribute("pedidos")) != null){%>
                        <c:forEach var="ped" items="${pedidos}">
                            <li>Item pedido
                            ${ped.getNome()}
                            Numero de itens pedidos
                            ${ped.getQuantidade()}
                            </li>
                        </c:forEach>
            <%}%>
        </ul>
        <input type="submit" value="Fechar Pedido" name="btnFecharPedido" />
<%@include file="../jspf/footerjsp.jsp" %>
