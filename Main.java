public class Main {
public static void main(String[] args) {

    Library<Media> libraryObj=new Library<>();

    LibraryObserver observer=new LibraryCustomers();
    libraryObj.addObserver(observer);


    Media book1 = new Book(2000, 15);
    Media book2 = new Book(1500, 20);
    Media movie = new Movie(5000, 40);
    Media magazine = new Magazine(300,12);
    Media AudioBook = new AudioBook(500, 15);
    libraryObj.addMediaItem(book1);
    libraryObj.addMediaItem(movie);
    libraryObj.addMediaItem(AudioBook);
    libraryObj.addMediaItem(magazine);

    libraryObj.updateMediaPrice(book1, 2200);

    //Add second book
    libraryObj.addMediaItem(book2);

    libraryObj.removeMediaItem(book1);

   



    
    
}
    
}
