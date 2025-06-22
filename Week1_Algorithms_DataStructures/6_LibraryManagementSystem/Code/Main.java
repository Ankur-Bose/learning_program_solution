import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Library library = new Library();
        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(3, "Data Structures", "Robert Lafore"));
        books.add(new Book(2, "Algorithms", "Thomas Cormen"));

        // Linear search
        Book result1 = library.linearSearchByTitle(books, "Algorithms");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Sort the list by title before binary search
        books.sort(Comparator.comparing(book -> book.title.toLowerCase()));

        // Binary search
        Book result2 = library.binarySearchByTitle(books, "Algorithms");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
