package DCC192.ufjf.br.Servlets;

import DCC192.ufjf.br.Dados.Estoque;
import DCC192.ufjf.br.Dados.Itens;
import DCC192.ufjf.br.Dados.Mesas;
import DCC192.ufjf.br.Dados.Restaurante;
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
@WebServlet(name = "indexServlet", urlPatterns = {"/index.html", "/produto.html",
     "/pedirconta.html"})
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
        } else if ("/produto.html".equals(request.getServletPath())) {
            criaEstoque(request, response);
        }  else if ("/pedirconta.html".equals(request.getServletPath())) {
            if (Restaurante.getMesasRestaurante().
                    get(Integer.parseInt(request.getParameter("id"))).isStatus()) {
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/pedirconta.jsp");
                request.setAttribute("mesaAFechar", Restaurante.getMesasRestaurante().
                        get(Integer.parseInt(request.getParameter("id"))));
                request.setAttribute("pedidos", Restaurante.getMesasRestaurante().
                        get(Integer.parseInt(request.getParameter("id"))).
                        getPedido());
                despachante.forward(request, response);
            }else{
               response.sendRedirect("controlemesas.html");
            }
        }
    }

    private void criaEstoque(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/produto.jsp");
        request.setAttribute("estoque", Estoque.getItensEstoque());
        despachante.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idMesa = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("mesa", Restaurante.getInstanceById(idMesa));
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fecharmesas.jsp");
        Restaurante.getInstanceById(idMesa).setHoraFechamento();
        Restaurante.getInstanceById(idMesa).setStatus(false);
        request.setAttribute("restaurante", Restaurante.getMesasRestaurante());
        despachante.forward(request, response);
    }
}
