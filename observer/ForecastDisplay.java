package Observer;

public class ForecastDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}
	
	public String forecast(){
		if(humidity>=70)
			return "rainy weather";
		else
			return "sunny day";
	}
	
	public void display(){
		System.out.println("Forecast: "+forecast());
	}

}
