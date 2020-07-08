
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    private static final String paramPseudo = "Bonjour " ;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Set response content type
        resp.setContentType("text/html");

        //Actual logic goes here.
        PrintWriter out = resp.getWriter();
        //out.println("<h1>" + TEST_MESSAGE + "</h1>");
        final String paramPseudo = req.getParameter("pseudo");
        out.println("Bonjour "+ paramPseudo + " ! </br>");
    }
}
