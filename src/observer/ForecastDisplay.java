package observer;

import subject.Subject;

public class ForecastDisplay implements Observer,DisplayElements {
    private float humidity;
    private Subject wetherData;
    public ForecastDisplay(Subject wetherData){
        this.wetherData = wetherData;
        wetherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("This ForecastDisplay: " +humidity+ "% humidity");
    }
    @Override
    public void update(float temperature, float humidity,float pressure) {
        this.humidity=humidity;
        this.display();
    }
}
