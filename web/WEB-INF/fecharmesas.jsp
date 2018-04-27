<%@page import="java.util.ArrayList"%>
<%@page import="DCC192.ufjf.br.Dados.Restaurante"%>
<%@page import="DCC192.ufjf.br.Dados.Mesas"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 
    Document   : controlemesasjsp
    Created on : 22/04/2018, 14:11:44
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
<table border="1">
    <thead>
        <tr>
            <th>Numero da Mesa</th>
            <th>Consumo</th>
            <th>Mesa disponivel</th>
            <th>Hora de Abertura</th>
            <th>Hora de Fechamento</th>
            <th>Pedir Conta</th>
            <th>Excluir Mesa</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="rest" items="${restaurante}">                
            <tr>
               
                <td>${rest.getId()}</td>
                <td>${rest.valorConsumo()}</td>
                <td>${rest.mesaLivre()}</td>
                <td>${rest.getHoraAbertura()}</td>
                <td>${rest.getHoraFechamento()}</td>
                <td><a href="pedirconta.html?id=${rest.getId()}"><input type="submit" value="Pedir Conta" name="btnConta"/></a></td>
                <td><a href="excluir.html?id=${rest.getId()}"><input type="submit" value="excluir mesa" name="btnExcluirMesa" /></a></td>
                
                
            </tr>
        </c:forEach>
            <tr><a href="adcionarmesas.html"> 
           <input type="submit" value="adicionar nova mesa" name="btnAddMesa" /></a></tr>


    </tbody>
</table>

<%@include file="../jspf/footerjsp.jsp" %>
