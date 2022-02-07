import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Quote> favQuotes = new ArrayList<>();
        Author bruce = new Author("Bruce", "Lee");
        Quote beLikeWater = new Quote(bruce, "Empty your mind, be formless. Shapeless, like water.");
        Quote tenThousand = new Quote(bruce, "I fear not the man who has practiced 10,000 kicks once, but I fear the man who has practiced one " +
                "kick 10,000 times.");
        Quote knowCharacter = new Quote(bruce, "Knowledge will give you power, but character respect.");
        favQuotes.add(beLikeWater);
        favQuotes.add(tenThousand);
        favQuotes.add(knowCharacter);
        System.out.println(favQuotes);

        for(Quote quote : favQuotes){
            System.out.println(quote);
        }
    }
}
