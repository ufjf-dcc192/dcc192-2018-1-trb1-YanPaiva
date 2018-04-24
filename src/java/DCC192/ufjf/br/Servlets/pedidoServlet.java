/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.Dados.Estoque;
import DCC192.ufjf.br.Dados.Itens;
import DCC192.ufjf.br.Dados.Restaurante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YanNotebook
 */
@WebServlet(name = "pedidoServlet", urlPatterns = {"/fazerpedido.html"})
public class pedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
        request.setAttribute("estoque", Estoque.getItensEstoque());
        despachante.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Itens novoItem;
        String nomeitemPedido = request.getParameter("pedidos");
        Integer qtdPedido = Integer.parseInt(request.getParameter("Quantidade"));

        if (qtdPedido != null) {

            novoItem = Estoque.getInstanceByName(nomeitemPedido);
            if (novoItem != null) {
                novoItem.setQuantidade(qtdPedido);
                request.setAttribute("pedidos", novoItem);
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
                //request.setAttribute("estoque", Estoque.getItensEstoque());
                despachante.forward(request, response);
            }
        }

    }

}
