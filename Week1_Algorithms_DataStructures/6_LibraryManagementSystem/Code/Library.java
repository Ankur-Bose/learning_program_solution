import java.util.*;

public class Library {

    public static Book linearSearchByTitle(List<Book> books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearchByTitle(List<Book> books, String targetTitle) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);

            int compare = midBook.title.compareToIgnoreCase(targetTitle);
            if (compare == 0) {
                return midBook;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}