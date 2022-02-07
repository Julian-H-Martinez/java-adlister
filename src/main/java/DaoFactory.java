public class DaoFactory {
    //  singleton pattern to ensure we are not duplicating
    private static Albums albumsDao;
    public static Albums getAlbumsDao(){
        if(albumsDao == null){
            albumsDao = new StaticAlbumsDao();
        }
        return albumsDao;
    }

}
