public class LibraryEvent {

  private Media mediaItem;
  private String eventType;

  //constructor
  public LibraryEvent(String eventType, Media mediaItem)
  {
    this.eventType=eventType;
    this.mediaItem=mediaItem;
  }

  public String getEventType()
  {
    return eventType;
  }
  public Media getMediaItem()
  {
    return mediaItem;
  }

}