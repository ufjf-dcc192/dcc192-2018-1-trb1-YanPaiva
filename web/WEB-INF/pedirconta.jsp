<%-- 
    Document   : pedirconta
    Created on : 24/04/2018, 22:59:31
    Author     : YanNotebook
--%>
<%@page import="DCC192.ufjf.br.Dados.Mesas"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>

<table border="1">
    <thead>
        <tr>
            <th>Horario de Entrada</th>
            <th>Itens pedidos</th>
            <th>Quantidade de itens pedidos</th>
            <th>Valor dos itens</th>
        </tr>
    </thead>
    <tbody>
         <%if((request.getAttribute("pedidos")) != null){%>
                        <form method="post">
                            <c:forEach var="ped" items="${pedidos}">
                            <tr>
                            <td>${mesaAFechar.getHoraAbertura()}</td>
                            <td>${ped.getNome()}</td>
                            <td>${ped.getQuantidade()}</td>
                            <td>${ped.getPreco()}</td>                            
                            </tr>
                             </c:forEach>
                            <td colspan="3" border="0"><input type="submit" value="Somar tudo" name="btnSomar" id="${mesaAFechar.getId()}" /></td>
                        </form>  
                            <td>TOTAL A PAGAR:</td>
                            <TD><%=((Mesas)request.getAttribute("mesa")).valorConsumo()%></TD>
                            <tr>
                            </tr>    
                            <%}%>
          
    </tbody>
</table>

<%@include file="../jspf/footerjsp.jsp" %>