public class AudioBook implements Media{
    private double price;
    private int quantity;

    //constructor
    public AudioBook(double price, int quantity)
    {
        this.price=price;
        this.quantity=quantity;
    }

    //Overriding functions 
    @Override
    public void updatePrice(double newPrice)
    {
        this.price=newPrice;
    }

    @Override
    public void quantity(int quantity)
    {
        this.quantity=quantity;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public int getQuantity()
    {
        return quantity;
    }
    @Override
    public String toString() {
        return  "Media Type: AudioBook, Quantity: " + quantity + ", Price: " + price ;
    }
}
