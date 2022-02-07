public class DaoFactory {
    //  singleton pattern to ensure we are not duplicating
    //  ensure when making use of DAO across all servlets we're not instantiating multiple
    private static Albums albumsDao;
    public static Albums getAlbumsDao(){
        if(albumsDao == null){
            albumsDao = new StaticAlbumsDao();
        }
        return albumsDao;
    }

}
