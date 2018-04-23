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
                    <c:forEach var="mesasdorestaurante" items="${mesasdorestaurante}">
                    <tr>
                        <%-- <td>${mesasdorestaurante.getCodigo()}</td>--%>
                        
                    </tr>
                    </c:forEach>


                                    
            </tbody>
        </table>

    </body>
</html>
