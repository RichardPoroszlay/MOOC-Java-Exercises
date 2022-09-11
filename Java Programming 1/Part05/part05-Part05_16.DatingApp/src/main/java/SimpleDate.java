
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int getDay() {
        return this.day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    } 
    
    // part 1
    public void advance() {
        this.day += 1;
        if(this.day > 30) {
            this.day = 1;
            this.month += 1;
        }
        if(this.month > 12) {
            this.month = 1;
            this.year += 1;
        }
    }
   
    // part 2
    public void advance(int howManyDays) {
        int counter = 0;
        while(counter < howManyDays) {
            if(this.day > 30) {
                this.day = 1;
                this.month += 1;
            } else {
                this.day += 1;
                ++counter;
            }
            if(this.month > 12) {
                this.month = 1;
                this.year += 1;
            }      
        }
    }
    
    // part 3
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        int counter = 0;
        while(counter < days) {
            if(newDate.getDay() > 30) {
                newDate.setDay(1);
                newDate.setMonth(this.month+1);
                newDate.day += 1;
                ++counter;
            } else {
                newDate.day += 1;
                ++counter;
            }
            
            if(newDate.month > 12) {
                newDate.setMonth(1);
                newDate.setYear(newDate.year+1);
            }
        }
        
        
        if(newDate.getDay() > 30) {
            newDate.setDay(1);
            newDate.setMonth(this.month+1);
            newDate.setDay(1+(days-1));
        }
        
        return newDate;
    }
}


