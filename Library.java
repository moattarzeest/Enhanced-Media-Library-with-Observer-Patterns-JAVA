import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaItems;
    private List<LibraryObserver> observers = new ArrayList<>();


    //constructor
    public Library()
    {
        this.mediaItems=new ArrayList<>();
        this.observers=new ArrayList<>();
    }

    //Methods
    public List<T> getMediaItems()
    {
        return new ArrayList<>(mediaItems);
    }
    
    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(LibraryObserver observer)
    {
        observers.remove(observer);
    }

    public void addMediaItem(T item)
    {
        mediaItems.add(item);
        notifyObservers(new LibraryEvent("New item added", item));
    }
    public void removeMediaItem(T item)
    {
        mediaItems.remove(item);
        notifyObservers(new LibraryEvent("Media item removed", item));
    }

    public void updateMediaPrice(T item, double newPrice)
    {
        item.updatePrice(newPrice);
        notifyObservers(new LibraryEvent("Update Price", item));
    }
    

   

    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.updateEvent(event);
        }
    }


}

