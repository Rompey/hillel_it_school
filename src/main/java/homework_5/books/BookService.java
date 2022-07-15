package homework_5.books;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookService {
    Set<Book> listBooksByAuthors(String author, Map<String, List<Book>> books);

}
