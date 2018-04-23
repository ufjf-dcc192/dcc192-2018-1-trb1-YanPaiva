<%-- 
    Document   : mesasjsp
    Created on : 20/04/2018, 22:30:00
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/cabecalho.jsp" %>
        <hr>
        <h2>Selecione uma mesa</h2>
        <select name="Mesas">
            <c:forEach var="restaurante" items=${restaurante}>                
                    <option>${restaurante.getCodigo()}</option>
            </c:forEach>
                
            
            
        </select>
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
                    <td>xx</td>
                    <td>18:00</td>
                    <td>--</td>
                    <td><input type="radio" name="" value="" checked="checked" disabled="disabled" /> </td>
                    <td><a href="fazerpedido.html"><input type="submit" value="Fazer Pedido" name="btnPedido" /></a></td>
                                        
                </tr>
            </tbody>
        </table>

        
        
    </body>
</html>
