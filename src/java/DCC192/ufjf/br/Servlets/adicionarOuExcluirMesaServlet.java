/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.Dados.Mesas;
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
@WebServlet(name = "adicionarOuExcluirMesaServlet", urlPatterns = {"/adcionarmesas.html", "/excluir.html"})
public class adicionarOuExcluirMesaServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/adcionarmesas.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fecharmesas.jsp");
            Restaurante.getMesasRestaurante().add(new Mesas());
            request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
            despachante.forward(request, response);
           // response.sendRedirect("controlemesas.html");
        } else if ("/excluir.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/excluirmesa.jsp");
            request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
            despachante.forward(request, response);
            
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mesa = Integer.parseInt(request.getParameter("id"));
        String sim = request.getParameter("btnsim");
        
        if(!"".equals(sim)){
            Restaurante.getMesasRestaurante().remove(mesa);
            Restaurante.atualizaID();
        }
        Restaurante.getMesasRestaurante().size();
        response.sendRedirect("controlemesas.html");
    }
}
