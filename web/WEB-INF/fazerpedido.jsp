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
        <form method="post">
        <table border="1">
            <thead>
                <tr>
                    <th>Selecione o item</th>
                    <th>Quantidade</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><select name="pedidos" >
                        <c:forEach var="est" items="${estoque}">
                            <option>${est.getNome()}</option>
                        </c:forEach>
                        </select></td>
                    
                        <td><input type="text" name="Quantidade" value="--" size="100" /></td>
                    <td><input type="submit" value="Adicionar ao pedido" name="btnAdicionarPedido" /></td>
                </tr>           
            </tbody>
        
            </table>
        </form>
        <hr>
        <ul type="circle">
            <%if(((Itens)request.getAttribute("pedidos")) != null){%>
            <li><%=((Itens)request.getAttribute("pedidos")).getNome()%></li>
            <%}%>        
            <li>pedido 1</li>
            <li>pedido 2</li>
        </ul>
        <input type="submit" value="Fechar Pedido" name="btnFecharPedido" />
<%@include file="../jspf/footerjsp.jsp" %>
