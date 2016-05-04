package observer;

import subject.Subject;

public class StatisticDisplay implements DisplayElements,Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject wetherData;
    public StatisticDisplay(Subject wetherData){
        this.wetherData = wetherData;
        wetherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("This StatisticDisplay: "+temperature+"F degree and " +humidity+ "% humidity and "+ pressure+ " pressure");
    }
    @Override
    public void update(float temperature, float humidity,float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        this.display();
    }
}
