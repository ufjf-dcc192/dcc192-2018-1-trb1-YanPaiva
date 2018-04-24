/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Servlets;

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
@WebServlet(name = "controleMesasServlet", urlPatterns = {"/mesas.html", "/controlemesas.html"})
public class controleMesasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listarRestaurante(request, response);

    }

    private void listarRestaurante(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        if ("/controlemesas.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/controlemesas.jsp");
            request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
            despachante.forward(request, response);
        }else if ("/mesas.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
            request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
            despachante.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer mesas = Integer.parseInt(request.getParameter("mesas"));
        request.setAttribute("mesa", Restaurante.getInstanceById(mesas));
        listarRestaurante(request, response);
    }
}
