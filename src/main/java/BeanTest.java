import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        /*Albums*/
        Album bobAndTheWailers = new Album(1, "Bob Marley and The Wailers", "Legend: The Best of Bob Marley and the Wailers", 1984, 25.0F, "Reggae");
        System.out.println(bobAndTheWailers);

        /*Quotes Array*/
        List<Quote> favQuotes = new ArrayList<>();

        /*Author(s)*/
        Author bruce = new Author(1L, "Bruce", "Lee");

        /*Quotes*/
        Quote beLikeWater = new Quote(1L, bruce, "Empty your mind, be formless. Shapeless, like water.");
        Quote tenThousand = new Quote(2L, bruce, "I fear not the man who has practiced 10,000 kicks once, but I fear the man who has practiced one " +
                "kick 10,000 times.");
        Quote knowCharacter = new Quote(3L, bruce, "Knowledge will give you power, but character respect.");

        /*adding quotes to ArrayList<>()*/
        favQuotes.add(beLikeWater);
        favQuotes.add(tenThousand);
        favQuotes.add(knowCharacter);
//        System.out.println(favQuotes);

        for(Quote quote : favQuotes){
            System.out.println(quote);
        }

//        System.out.println(beLikeWater.getAuthor().getFirstName() + " " + beLikeWater.getAuthor().getLastName());
    }
}
