<%-- 
    Document   : adcionarmesas
    Created on : 22/04/2018, 20:26:16
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
<h3>Digite o codigo da Mesa</h3>
        <input type="text" name="codigo da mesa" value="--" size="5" />
        <h3>Digite o codigo a descrição da mesa</h3>
        <input type="text" name="descrição da mesa" value="--" size="80" />
        <br>
        <a href="controlemesas.html"><input type="submit" value="adicionar mesa" name="btnAddMesa" /></a>
    </body>
</html>
