
public class Appliance {
	private String model;
	private String voltage;
	private double wattage;
	private boolean isPluggedIn;
	
	public Appliance() {
		
	}
	
	public Appliance(String model, String voltage, double wattage) {
		this.model = model;
		this.voltage = voltage;
		this.wattage = wattage;
		this.isPluggedIn = false;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public double getWattage() {
		return wattage;
	}
	public void setWattage(double wattage) {
		this.wattage = wattage;
	}
	public boolean getIsPluggedIn() {
		return isPluggedIn;
	}
	public void setIsPluggedIn(boolean isPluggedIn) {
		this.isPluggedIn = isPluggedIn;
	}
	
	
	public void TurnOn() {
		this.isPluggedIn = true;
		System.out.println("The appliance is plugged out.");
	}
	
	public void TurnOff() {
		this.isPluggedIn = false;
		System.out.println("The appliance is plugged in.");
	}
	
	public double ComputeConsumption(double hours) {
		double consumption = hours*this.wattage;
		return consumption;
	}
}
