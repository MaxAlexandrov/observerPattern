package subject;

import observer.Observer;
import java.util.ArrayList;

public class WetherData implements Subject {
    public ArrayList observers;
    public float temperature;
    public float pressure;
    public float humidity;
    public WetherData(){
        observers= new ArrayList();
    }
    @Override
    public void removeObserver(Observer observer) {
        int index =  observers.indexOf(observer);
        if(index >=0){
            observers.remove(index);
        }
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifiAllObserver() {
        for (int i=0; i< observers.size();i++) {
           Observer observer = (Observer) observers.get(i);
            observer.update(temperature,pressure,humidity);
        }
    }
     public void measurementsChanged(){
        notifiAllObserver();
    }
    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
