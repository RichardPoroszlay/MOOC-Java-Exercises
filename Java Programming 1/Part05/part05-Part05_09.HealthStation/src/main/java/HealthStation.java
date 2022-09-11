
public class HealthStation {
    private int total;

    public int weigh(Person person) {
        ++this.total;
        return person.getWeight();    
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings() {
        return this.total;
    }
}
