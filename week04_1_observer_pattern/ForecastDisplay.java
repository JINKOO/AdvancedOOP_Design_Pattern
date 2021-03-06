package week04_1_observer_pattern;

public class ForecastDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("ForeCast: Improving weather on the way!");
	}

}
