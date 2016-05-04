package station;

import observer.CurrentConditionalDisplay;
import observer.ForecastDisplay;
import observer.StatisticDisplay;
import observer.TherdPartyDisplay;
import subject.WetherData;

public class WetherStation {
    public static void main(String[] args) {
        WetherData wetherData = new WetherData();
        CurrentConditionalDisplay currentConditionalDisplay = new CurrentConditionalDisplay(wetherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wetherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(wetherData);
        TherdPartyDisplay therdPartyDisplay = new TherdPartyDisplay(wetherData);
        wetherData.setMeasurements(33,80.4f,76);
        wetherData.setMeasurements(5,90.3f,81);
        wetherData.setMeasurements(15,100.6f,100);
        wetherData.setMeasurements(25,76.1f,98);
    }
}
