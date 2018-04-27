<%-- 
    Document   : adcionarmesas
    Created on : 22/04/2018, 20:26:16
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
<h3>Digite o codigo da Mesa</h3>
<form method="post">
    
    <h2>Você deseja realmente excluir esta mesa?</h2>   
    <input type="submit" value="Sim" name="btnSim" />
    <input type="submit" value="Não" name="btnNão" />
</form>
<%@include file="../jspf/footerjsp.jsp" %>
