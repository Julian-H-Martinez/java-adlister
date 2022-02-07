import java.util.List;
//  interface is informing us structure of DAO
//  this example is static (hardcoded)
//  worry about one structure at a time
public interface Albums {
    //  build out abstract methods that will be implented by DAO
    //  CRUD Method being called (C == insert, R == all()/findOne(), U == update, D == destroy
    List<Album> all();
    Album findOne(long id);
    void insert(Album album);
    void update(Album album);
    void destroy(Album album);


}
//  create a DAO for static info that we will enter manually

//  separate DAO to make connection between data and request