package observer;

import subject.Subject;

public class CurrentConditionalDisplay implements DisplayElements,Observer{
    private float temperature;
    private float humidity;
    private Subject wetherData;
    public CurrentConditionalDisplay(Subject wetherData){
        this.wetherData = wetherData;
        wetherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("This Current Conditional Display: "+temperature+"F degree and " +humidity+ "% humidity");
    }
    @Override
    public void update(float temperature, float humidity,float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.display();
    }
}
