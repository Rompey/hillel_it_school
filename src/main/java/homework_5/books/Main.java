package homework_5.books;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        final Set<Book> books = bookService.listBooksByAuthors("Author1", map());
        System.out.println("Author1: ");
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
    }

    static Map<String, List<Book>> map() {
        Map<String, List<Book>> books = new HashMap<>();
        books.put("Author1", Arrays.asList(new Book("myBook"), new Book("myBook1")));
        books.put("Author2", Arrays.asList(new Book("myBook2"), new Book("myBook3")));
        books.put("Author3", Arrays.asList(new Book("myBook4"), new Book("myBook5")));
        return books;
    }
}
