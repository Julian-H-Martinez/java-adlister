import java.util.List;

public class AdDaoTester {
    public static void main(String[] args) {
        //  Ads -> DaoFactory
        Ads adDao = DaoFactory.getAdsDao();
        List<Ad> ads = adDao.all();
        for(Ad ad : ads){
            System.out.printf("Title: %s%nDescription: %s%n", ad.getTitle(), ad.getDescription());
        }

    }
}
