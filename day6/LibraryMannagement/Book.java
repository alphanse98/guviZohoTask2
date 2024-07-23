public class Book {

    int id = 0;
    static  int count = 1;
    String bookName;
    String bookTile;
    String author;
    String genre;

    public Book (String bookName, String bookTile, String author, String genre){
        this.id = count++;
        this.bookName = bookName ;
        this.bookTile = bookTile ;
        this. author = author;
        this.genre = genre;
    }

    // Override the toString method to display book details
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTile + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
