import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//  don't need name and urlPatterns keywords
//  only need actual urlPattern
@WebServlet("/albums/create")
public class CreateAlbumServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/albums/create.jsp").forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //  need info from form submitted
        Albums albumsDao = DaoFactory.getAlbumsDao();
        String name = req.getParameter("name");
        String artist = req.getParameter("artist");
        //  to parse String to int
        int releaseDate = Integer.parseInt(req.getParameter("releaseDate"));
        float sales = Float.parseFloat(req.getParameter("sales"));
        String genre = req.getParameter("genre");

        //  currently don't have id
        //  instantiating id
        long id = 1;
        for (Album album : albumsDao.all()){
            if(album.getId() > id){
                //  at the very least will be 1
                id = album.getId() + 1;
            }
        }
        Album newRecord = new Album(id, artist, name, releaseDate, sales, genre);
        albumsDao.insert(newRecord);
        res.sendRedirect("/albums");

        //  once server is turned off all info not stored in db will be deleted
        //
    }
}
