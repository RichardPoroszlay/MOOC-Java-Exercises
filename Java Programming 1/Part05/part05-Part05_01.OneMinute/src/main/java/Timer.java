
public class Timer {
    private int secondsLimit = 60;
    private int hundredthsLimit = 100;
    private int seconds = 0;
    private int hundredths = 0;
    
    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }
    
    public void advance() {
        ++this.hundredths;
        if(this.hundredths >= hundredthsLimit) {
            this.hundredths = 0;
            ++this.seconds;
            if(this.seconds >= secondsLimit) {
                this.seconds = 0;
            }
        }
    }
    
    public String toString() {
        if(this.seconds < 10 && this.hundredths < 10) {
            return "0" + this.seconds + ":0" + this.hundredths;
        } else if(this.seconds < 10) {
            return "0" + this.seconds + ":" + this.hundredths;
        } else if(this.hundredths < 10) {
            return this.seconds + ":0" + this.hundredths;
        }

        return this.seconds + ":" + this.hundredths;
    }
}
