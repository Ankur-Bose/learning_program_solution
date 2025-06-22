import java.util.*;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the format in which you want to export your document");
        String format = sc.nextLine();
        DocumentFactory factory;
        switch (format.trim().toLowerCase()) {
            case "word document":
                factory = new WordDocumentFactory();
                break;
            case "pdf document":
                factory = new PDFDocumentFactory();
                break;
            case "excel document":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid Format");
                sc.close();
                return;
        }

        Document doc = factory.creaDocument();
        doc.document();
        sc.close();
    }
}