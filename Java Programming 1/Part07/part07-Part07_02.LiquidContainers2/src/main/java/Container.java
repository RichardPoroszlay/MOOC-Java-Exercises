public class Container {
    private int amountOfLiquid;
    private int maxAmount;
    
    public Container() {
        this.amountOfLiquid = 0;
        this.maxAmount = 100;
    }
    
    public int contains() {
        return this.amountOfLiquid;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            this.amountOfLiquid = this.amountOfLiquid;
        } else {
            this.amountOfLiquid += amount;
            if(this.amountOfLiquid > this.maxAmount) {
                this.amountOfLiquid = 100;
            }
        } 
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            this.amountOfLiquid = this.amountOfLiquid;
        } else {
            this.amountOfLiquid -= amount;
            if(this.amountOfLiquid < 0) {
                this.amountOfLiquid = 0;
            }
        }
    }
    
    public String toString() {
        return this.amountOfLiquid + "/" + this.maxAmount;
    }
}
