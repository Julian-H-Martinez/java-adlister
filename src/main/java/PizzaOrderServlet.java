import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet (name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crustType");
        System.out.println(crust);
        String sauce = req.getParameter("sauceType");
        System.out.println(sauce);
        String size = req.getParameter("size");
        System.out.println(size);
        String[] toppings = req.getParameterValues("topping");
        System.out.println(Arrays.toString(toppings));
        String street = req.getParameter("street");
        String city = req.getParameter("city");
        String zip = req.getParameter("zip");
        System.out.printf("%s %s %s", street, city, zip);
//        System.out.printf("Address to deliver to: %s %s %s", street, city, zip);

        resp.sendRedirect("/pizza-order");

    }
}

//Object obj = JSONValue.parse(data);
//JSONArray array = (JSONArray) obj;
