package Observer;
import java.util.*;
public class StatisticsDisplay implements Observer,DisplayElement{
	private ArrayList<Float> temperature=new ArrayList<Float>();
	private float humidity;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature,float humidity,float pressure){
		this.temperature.add(temperature);
		this.humidity=humidity;
		display();
	}
	
	public float avg(){
		float sum=0;
		Iterator<Float> it=this.temperature.iterator();
		while(it.hasNext())
			sum+=it.next();
		return sum/this.temperature.size();
	}
	
	public float max(){
		float max=this.temperature.get(0);
		for(float value : this.temperature){
			if(value>max)
				max=value;
		}
		return max;
	}
	
	public float min(){
		float min=this.temperature.get(0);
		for(float value : this.temperature){
			if(value<min)
				min=value;
		}
		return min;
	}
	public void display(){
		System.out.println("Avg/Max/Min temperature = "+avg()+"/"+max()+"/"+min());
	}

}
