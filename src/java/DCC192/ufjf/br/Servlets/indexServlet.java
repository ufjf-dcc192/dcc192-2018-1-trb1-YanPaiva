package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.Dados.Estoque;
import DCC192.ufjf.br.Dados.Itens;
import DCC192.ufjf.br.Dados.Mesas;
import DCC192.ufjf.br.Dados.RestauranteDeVo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "indexServlet", urlPatterns = {"/index.html", "/controlemesas.html",
    "/mesas.html", "/produto.html",
    "/fazerpedido.html", "/adcionarmesas.html"})
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
        } else if ("/controlemesas.html".equals(request.getServletPath())) {
            listarRestaurante(request, response);
        } else if ("/mesas.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
            despachante.forward(request, response);
        } else if ("/produto.html".equals(request.getServletPath())) {
            criaEstoque(request, response);
        } else if ("/fazerpedido.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            despachante.forward(request, response);
        } else if ("/adcionarmesas.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/adcionarmesas.jsp");
            despachante.forward(request, response);
        }
    }
    
    private void criaEstoque(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/produto.jsp");
        request.setAttribute("estoque", Estoque.getItensEstoque());
        despachante.forward(request, response);
    }

    private void listarRestaurante(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/controlemesas.jsp");
        request.setAttribute("mesasdorestaurante", RestauranteDeVo.getMesasRestaurante());
        despachante.forward(request, response);        
    }
}
