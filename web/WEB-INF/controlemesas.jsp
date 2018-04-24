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
                    <th>Pedir Conta</th>
                    <th>Excluir Mesa</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <c:forEach var="rest" items="${restaurante}">
                    <tr>
                        <td>${rest.getCodigo()}</td>                        
                        <td>${rest.valorConsumo()}</td>
                        <td>${rest.mesaLivre()}</td>
                        <td><input type="submit" value="Pedir Conta" name="btnConta" /></td>
                        <td><input type="submit" value="excluir mesa" name="btnExcluirMesa" /></td>
                    </tr>
                    </c:forEach>


                                    
            </tbody>
        </table>

<%@include file="../jspf/footerjsp.jsp" %>
