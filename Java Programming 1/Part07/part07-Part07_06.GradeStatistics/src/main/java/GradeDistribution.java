
public class GradeDistribution {
    private int gradeFive;
    private int gradeFour;
    private int gradeThree;
    private int gradeTwo;
    private int gradeOne;
    private int failed;
       
    private Point points;
    
    public GradeDistribution(Point points) {
        this.points = points;
    }
    
    public int getGradeFives() {
        return this.gradeFive;
    }
    
    public void gradeFiveStars() {
        System.out.print("5:");
        for(int i = 0; i < this.getGradeFives(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public int getGradeFours() {
        return this.gradeFour;
    }
    
    public void gradeFourStars() {
        System.out.print("4:");
        for(int i = 0; i < this.getGradeFours(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public int getGradeThrees() {
        return this.gradeThree;
    }
    
    public void gradeThreeStars() {
        System.out.print("3:");
        for(int i = 0; i < this.getGradeThrees(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public int getGradeTwos() {
        return this.gradeTwo;
    }
    
    public void gradeTwoStars() {
        System.out.print("2:");
        for(int i = 0; i < this.getGradeTwos(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public int getGradeOnes() {
        return this.gradeOne;
    }
    
    public void gradeOneStars() {
        System.out.print("1:");
        for(int i = 0; i < this.getGradeOnes(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public int getFails() {
        return this.failed;
    }
    
    public void failStars() {
        System.out.print("0:");
        for(int i = 0; i < this.getFails(); ++i) {
            System.out.print('*');
        }
        System.out.print('\n');
    }
    
    public void counting(Point points) {
        for(int i = 0; i < points.size(); ++i) {
            if(points.get(i) < 50) {
                ++this.failed;
            } else if(points.get(i) < 60) {
                ++this.gradeOne;
            } else if(points.get(i) < 70) {
                ++this.gradeTwo;
            } else if(points.get(i) < 80) {
                ++this.gradeThree;
            } else if(points.get(i) < 90) {
                ++this.gradeFour;
            } else if(points.get(i) >= 90) {
                ++this.gradeFive;
            }
        }
    }
    
}
