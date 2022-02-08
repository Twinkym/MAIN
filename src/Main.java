import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title = askForBookTitle();
        int pages = askPages();
        Book book = new Book(pages, title);
        printBook(book);

    }

    private static void printBook(Book book) {
        System.out.println("Book created: " + book.getTitle()
        + "pagines: " + book.getPages());
    }

    private static int askPages() {
        Scanner sc = new Scanner((System.in));
        System.out.println(" Pages: ");
        return sc.nextInt();
    }

    private static String askForBookTitle() {
        Scanner sc = new Scanner((System.in));
        System.out.println("Title: ");
        return sc.nextLine();
    }


}
