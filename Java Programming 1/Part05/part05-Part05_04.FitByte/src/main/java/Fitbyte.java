
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    //private double maxHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
   
    
    public double targetHeartRate(double precentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        if(precentageOfMaximum >= 0 && precentageOfMaximum <= 1) {
            return (maxHeartRate - this.restingHeartRate) * (precentageOfMaximum) + this.restingHeartRate;
        }
        return 0;
    }

}
