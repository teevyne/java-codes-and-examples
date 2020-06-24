package chapterTwoB;

import java.util.Observable;

public class WeatherData extends Observable{
	private double temp;
	private double humidity;
	private double pressure;
	
	public WeatherData() {}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
}


//three players are:
//the actual weather station that tracks and supplies the weather data to the weatherdata object
//the weatherdata object that receives information from the weather station
//the display pane, for showing the current weather conditions
//
//The arrived source files: getTemp, getPress, getHumi methods, with a clue to method measurementsChanged - to call exactly when the data gets updated
//In the eventual diagram, why do the other three classes not have a pointer to the Subject interface? The CurrenctConditons class does have a pointer
//
//THE DIAGRAM
//Three interfaces - the Subject interface, the Observer interface and the Display interface
//The WeatherData implements the Subject interface, since it is a class holding data and states
//The elements to be updated and displayed (current conditions[temperature, pressure, humidity], statistics and forecast) all implement the Observer and Display interfaces, to get updated information from the WeatherData and display this received data respectively.
//
//check back the brain power implementation on page 102 and for fun, let's write code to grab code off the web for the weather station. Check out he new design for calling the display() methid in the MVC patterna
//weatherData.registerObserver(this); - what does this mean actually?

