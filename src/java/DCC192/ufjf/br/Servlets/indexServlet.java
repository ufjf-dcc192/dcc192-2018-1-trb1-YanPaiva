package DCC192.ufjf.br.Servlets;
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
@WebServlet(name = "indexServlet", urlPatterns = {"/index.html", "/controlemesas.html",
    "/mesas.html", "/produto.html" , "fazerpedido.html"})
public class indexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            despachante.forward(request, response);
        }else if("/controlemesas.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/controlemesas.jsp");
            despachante.forward(request, response);
        }else if("/mesas.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
            despachante.forward(request, response);
        }else if("/produto.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/produto.jsp");
            despachante.forward(request, response);
        }else if("/fazerpedido.html".equals(request.getServletPath())){
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/fazerpedido.jsp");
            despachante.forward(request, response);
        }
    }
}