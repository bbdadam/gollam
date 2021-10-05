import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Gollam {

    private static final int MAX_PAGES_TO_SEARCH = 10;
    private Set<String> pagesVisited = new HashSet<String>();
    //Using LinkedList to implement breadth-first search
    private List<String> pagesToVisit = new LinkedList<String>();

    private String nextUrl(){
        String nextUrl;
        do {
          nextUrl = this.pagesToVisit.remove(0);
        } while (this.pagesVisited.contains(nextUrl));
        this.pagesVisited.add(nextUrl);
        return nextUrl;
    }
}
