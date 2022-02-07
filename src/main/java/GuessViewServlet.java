import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessViewServlet", urlPatterns = "/guess")
public class GuessViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int userNum = Integer.parseInt(req.getParameter("num"));
//        System.out.println(userNum);
        int randomNum = (int)(Math.floor((Math.random()*3) + 1));
//        System.out.println(randomNum);
        if(userNum == randomNum){
            res.sendRedirect("/correct");
//        }else if(userNum != 1 || userNum != 2 || userNum != 3){
//            res.sendRedirect("/guess");
        }else{
            res.sendRedirect("/incorrect");
        }
    }


}
