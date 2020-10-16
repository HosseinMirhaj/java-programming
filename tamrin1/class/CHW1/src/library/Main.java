package library;

public class Main {
    public static void main(String[] args) {
        library book = new library();
        book.book_name = "jenayatomokafat";
        book.author = "dastayofski";
        book.person = "arash";
        System.out.println("pls enter the book name and author:" + book.book_name +"/"+ book.author);
        book.gereftn();
        System.out.println("pls givebache the book");
        book.pasdadn();
    }
}
