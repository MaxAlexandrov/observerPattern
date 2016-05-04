package observer;

import subject.Subject;

public class TherdPartyDisplay implements Observer,DisplayElements {
    private float temperature;
    private Subject wetherData;
    public TherdPartyDisplay(Subject wetherData){
        this.wetherData = wetherData;
        wetherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("This TherdPartyDisplay: "+temperature+"F degree");
    }
    @Override
    public void update(float temperature, float humidity,float pressure) {
        this.temperature=temperature;
        this.display();
    }
}
