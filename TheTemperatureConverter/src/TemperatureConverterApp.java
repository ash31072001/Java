
public class TemperatureConverterApp {
	public static void main(String[]args)
	{
		TemperatureConverter temperatureconverter = new TemperatureConverter();
		System.out.printf("%.2f" ,temperatureconverter.convertFahrenheitToCelsius(68.0));
	}
}
