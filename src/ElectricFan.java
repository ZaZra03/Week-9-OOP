import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricFan extends Appliance {
	private int fanSpeed;
	private int fanMaxSpeed;
	private boolean isSwiveled;
	private String fanType;
	private String[] fanTypes = { "Desk", "Stand", "Wall", "Ceiling", "Clip" };
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public ElectricFan(String model, int voltage, double wattage) {
		super(model, voltage, wattage);
		this.fanType = "";
		this.fanSpeed = 0;
		this.fanMaxSpeed = 0;
		this.isSwiveled = false;
	}

	public int getFanSpeed() {
		return fanSpeed;
	}

	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}

//	public int getFanMaxSpeed() {
//		return fanMaxSpeed;
//	}
//
//	public void setFanMaxSpeed(int fanMaxSpeed) {
//		this.fanMaxSpeed = fanMaxSpeed;
//	}

	public boolean isSwiveled() {
		return isSwiveled;
	}

	public void setSwiveled(boolean isSwiveled) {
		this.isSwiveled = isSwiveled;
	}

	public String getFanType() {
		return fanType;
	}

	public void setFanType(String fanType) {
		this.fanType = fanType;
	}

	public String getFanTypes(int index) {
		return fanTypes[index];
	}

	public void ChangeFanSpeed(int fanSpeed) {
		if (fanSpeed > fanMaxSpeed) {
			System.out.println("Max speed is only " + this.fanMaxSpeed);
		} else {
			this.fanSpeed = fanSpeed;
			System.out.println("Fan speed is changed to " + this.fanSpeed);
		}
	}

	public void ChangeFanMaxSpeed() {
		System.out.println("Set the max speed of your fan: ");
		try {
			this.fanMaxSpeed = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Max speed is set to " + this.fanMaxSpeed);
	}

	@Override
	public void PlugIn() {
		super.setIsPluggedIn(true);
		System.out.println("The Electric Fan is plugged in.");
	}
	@Override
	public void PlugOut() {
		super.setIsPluggedIn(false);
		System.out.println("The Electric Fan is plugged out.");
	}
	@Override
	public void TurnOn() {
		super.setIsTurnedOn(true);
		System.out.println("The Electric Fan is turned on.");
	}
	@Override
	public void TurnOff(double hours) {
		this.ComputeConsumption(hours);
		System.out.println("Total Consumption: " + super.getConsumption());
		super.setIsTurnedOn(false);
		System.out.println("The Electric Fan is turned off.");
	}
}
