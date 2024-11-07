public class LibraryCustomers implements LibraryObserver {

    @Override
    public void updateEvent(LibraryEvent event) {
        System.out.println("Event Type: " + event.getEventType());
        System.out.println("Media Item: " + event.getMediaItem());
        System.out.println("----------------------------");
    }

    
}
