
public class Appliance {
	private String model;
	private int voltage;
	private double wattage;
	private boolean isPluggedIn;
	private boolean isTurnedOn;
	private double consumption;

	public Appliance() {

	}

	public Appliance(String model, int voltage, double wattage) {
		this.model = model;
		this.voltage = voltage;
		this.wattage = wattage;
		this.isPluggedIn = false;
		this.isTurnedOn = false;
		this.consumption = 0;
	}

	public String getModel() {
		return model;
	}

	public int getVoltage() {
		return voltage;
	}

	public double getWattage() {
		return wattage;
	}

	public void setIsPluggedIn(boolean isPluggedIn) {
		this.isPluggedIn = isPluggedIn;
	}
	
	public boolean getIsTurnedOn() {
		return isTurnedOn;
	}

	public void setIsTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	public double getConsumption() {
		return consumption;
	}

	public void PlugIn() {
		this.isPluggedIn = true;
		System.out.println("The appliance is plugged in.");
	}

	public void PlugOut() {
		this.isPluggedIn = false;
		System.out.println("The appliance is plugged out.");
	}

	public void TurnOn() {
		this.isTurnedOn = true;
		System.out.println("The appliance is turned on.");
	}

	public void TurnOff(double hours) {
		this.ComputeConsumption(hours);
		System.out.println("Total Consumption: " + this.consumption);
		this.isTurnedOn = false;
		System.out.println("The appliance is turned off.");
	}

	public void ComputeConsumption(double hours) {
		this.consumption = hours * this.wattage;
	}
	
	public void DisplayInformation() {
		System.out.println("TV Model: " + this.model);
		System.out.println("TV Voltage: " + this.voltage);
		System.out.println("TV Wattage: " + this.wattage);
	}
}
