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
@WebServlet(name = "pedidoServlet", urlPatterns = {"/fazerpedido.html", "/abrirmesa.html", "/fechapedido.html"})
public class pedidoServlet extends HttpServlet {

    private static int saveID;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/fazerpedido.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            request.setAttribute("estoque", Estoque.getItensEstoque());
            request.setAttribute("pedidos", Pedido.getItensEstoque());
            despachante.forward(request, response);
        } else if ("/abrirmesa.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            request.setAttribute("estoque", Estoque.getItensEstoque());
            request.setAttribute("pedidos", Pedido.getItensEstoque());
            saveID = Integer.parseInt(request.getParameter("id"));
            if (Restaurante.getMesasRestaurante().get(saveID).getHoraAbertura().equals("--")) {
                Restaurante.getMesasRestaurante().get(saveID).setHoraAbertura();
                Restaurante.getMesasRestaurante().get(saveID).setStatus(true);
            }
            if(!Restaurante.getMesasRestaurante().get(saveID).getHoraFechamento().equals("--")){
                Restaurante.getMesasRestaurante().get(saveID).setHoraAbertura();
                Restaurante.getMesasRestaurante().get(saveID).mesaReaberta("--");
                Restaurante.getMesasRestaurante().get(saveID).setStatus(true);
                
            }
            despachante.forward(request, response);
        } else if ("/fechapedido.html".equals(request.getServletPath())) {
            request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
            Restaurante.getMesasRestaurante().get(saveID).addPedido(Pedido.getItensEstoque());
            Pedido.limpaArray();
            response.sendRedirect("mesas.html");
            
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeitemPedido = request.getParameter("pedidos");
        Integer qtdPedido = Integer.parseInt(request.getParameter("Quantidade"));
        if (qtdPedido > 0) {
            Itens aux = new Itens();
            aux = Estoque.getInstanceByName(nomeitemPedido);
            if (!jaFoiAdd(aux)){ 
                aux.setQuantidade(qtdPedido);
                Pedido.getItensEstoque().add(aux);
                response.sendRedirect("fazerpedido.html");
            } else {
                int indice = Pedido.getIndiceByName(nomeitemPedido);
                int valorAntigo = Pedido.getItensEstoque().get(indice).getQuantidade();
                Pedido.getItensEstoque().get(indice).setQuantidade(valorAntigo + qtdPedido);
                response.sendRedirect("fazerpedido.html");
            }

        } else {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            request.setAttribute("estoque", Estoque.getItensEstoque());
            despachante.forward(request, response);
        }
        
    }    

    private boolean jaFoiAdd(Itens aux) {
         return Pedido.getItensEstoque().contains(aux);
    }
}

    


