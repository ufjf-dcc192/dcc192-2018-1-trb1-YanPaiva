/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.Dados.Estoque;
import DCC192.ufjf.br.Dados.Itens;
import DCC192.ufjf.br.Dados.Pedido;
import DCC192.ufjf.br.Dados.Restaurante;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        request.setAttribute("pedidos",Pedido.getItensEstoque());            
        despachante.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeitemPedido = request.getParameter("pedidos");
        Integer qtdPedido =Integer.parseInt(request.getParameter("Quantidade"));
        if (qtdPedido > 0) {
            Itens aux = Estoque.getInstanceByName(nomeitemPedido);
            aux.setQuantidade(qtdPedido);
            //Pedido.getItensEstoque().add(aux);
            addNovaRequisição(aux);
            response.sendRedirect("fazerpedido.html");
        } else {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            request.setAttribute("estoque", Estoque.getItensEstoque());
            despachante.forward(request, response);
        }

    }
    private void addNovaRequisição(Itens aux) {
        int i;
        for(i=0;i<Pedido.getItensEstoque().size() &&
                !Pedido.getItensEstoque().get(i).getNome().equals(aux.getNome());i++);
        if(i==Pedido.getItensEstoque().size()){
            Pedido.getItensEstoque().add(aux);
        }else{
            int quantidadeAntiga =0; 
                quantidadeAntiga +=Pedido.getItensEstoque().get(i).getQuantidade() + aux.getQuantidade();
                Pedido.getItensEstoque().get(i).setQuantidade(quantidadeAntiga);
        }
    }

}
