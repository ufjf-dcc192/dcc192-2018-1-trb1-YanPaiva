<%@page import="java.util.ArrayList"%>
<%@page import="DCC192.ufjf.br.Dados.Restaurante"%>
<%@page import="DCC192.ufjf.br.Dados.Mesas"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 
    Document   : mesasjsp
    Created on : 20/04/2018, 22:30:00
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
        <hr>
        <h2>Selecione uma mesa</h2>
        <form method="post">
            <select name="mesas" >
                <c:forEach var="rest" items="${restaurante}">                
                    <option value="${rest.getCodigo()}" onselect="">${rest.getCodigo()}</option>  
                </c:forEach>
            </select>
            <input type="submit" value="Listar">
        </form>
        <table border="1">
            <thead>
                <tr>
                    <th>Numero da Mesa</th>
                    <th>Hora de abertura</th>
                    <th>Hora de fechamento</th>
                    <th>Stats</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=(Mesas)request.getAttribute("mesa") != null?((Mesas)request.getAttribute("mesa")).getCodigo():""%></td>             
                    <td><input type="radio" name="" value="" checked="checked" disabled="disabled" /> </td>
                          
                    <%--<td><input type="radio" name="" value="" checked="checked" disabled="disabled" /> </td>
                    <td>xx</td>
                    <td>18:00</td>
                    <td>--</td>
                    <td><a href="fazerpedido.html"><input type="submit" value="Fazer Pedido" name="btnPedido" /></a></td>
                    --%>                    
                </tr>
            </tbody>
        </table>

        
        
<%@include file="../jspf/footerjsp.jsp" %>
