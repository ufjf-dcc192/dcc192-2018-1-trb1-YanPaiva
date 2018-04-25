<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : produtojsp
    Created on : 20/04/2018, 22:30:23
    Author     : YanNotebook
--%>

<%@page import="java.util.List"%>
<%@page import="DCC192.ufjf.br.Dados.Estoque"%>
<%@page import="DCC192.ufjf.br.Dados.Itens"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>

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

                <c:forEach var="est" items="${estoque}">
                    <tr>
                        <td>${est.getCodigoDoProduto()}</td>
                        <td>${est.getDescricaoDoProduto()}</td>
                        <td>${est.getNome()}</td>
                        <td>${est.getPreco()}</td>

                    </tr>
                </c:forEach>



            </tbody>
        </table>


<%@include file="../jspf/footerjsp.jsp" %>
