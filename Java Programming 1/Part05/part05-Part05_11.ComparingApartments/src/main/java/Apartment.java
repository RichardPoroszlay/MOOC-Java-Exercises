
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    // part 1
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    // part 2
    public int priceDifference(Apartment compared) {
        if(this.pricePerSquare > compared.pricePerSquare) {
            return ((this.pricePerSquare*this.squares) - (compared.pricePerSquare*compared.squares));
        }
        return ((compared.pricePerSquare*compared.squares) - (this.pricePerSquare*this.squares));
    }
    
    //part 3
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.pricePerSquare*this.squares > compared.pricePerSquare*compared.squares) {
            return true;
        }
        return false;
    }
}
