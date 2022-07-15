package homework_5.books;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class BookServiceImpl implements BookService {
    public Set<Book> listBooksByAuthors(String author, Map<String, List<Book>> books) {
        final List<Book> list = books.get(author);
        return new HashSet<>(list);
    }
}
