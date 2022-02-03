import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    static int counter = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        String reset = req.getParameter("reset");
//        if(reset == "reset"){
//            counter = 0;
//        }else{
//            String response = String.format("<h1>%d%n</h1>", counter++);
//            out.println(response);
//        }

        String reset = req.getParameter("reset");
        if(reset == null){
            String response = String.format("<h1>%d%n</h1>", counter++);
            out.println(response);
//            out.println("<h1> Hello, World!</h1>");
        }else{
            counter = 0;
            out.printf("<h1>%d%n</h1>", counter);
        }
    }
}
