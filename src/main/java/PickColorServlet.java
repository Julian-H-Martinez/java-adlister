import javax.servlet.http.HttpServlet;

public class PickColorServlet extends HttpServlet {
}

//A user goes to /pickcolor and sees a page where they are prompted to enter their favorite color (using a text input).
// Upon clicking submit, they are
// redirected to /viewcolor and
// see a page with a background color of the submitted color.
//
//use a POST request on the form
//use two JSPs and two servlets
//use style tags to set the background color on the HTML body
//pass the data from one servlet to another by adding the color value in a query string