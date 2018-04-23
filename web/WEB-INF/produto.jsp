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
<div id="area-principal">
    <div id="postagem">

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

                <c:forEach var="estoque" items="${estoque}">
                    <tr>
                        <td>${estoque.getCodigoDoProduto()}</td>
                        <td>${estoque.getDescricaoDoProduto()}</td>
                        <td>${estoque.getNome()}</td>
                        <td>${estoque.getPreco()}</td>

                    </tr>
                </c:forEach>



            </tbody>
        </table>
    </div>
</div>

</body>
</html>
