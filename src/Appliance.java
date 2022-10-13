
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

	public void setModel(String model) {
		this.model = model;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
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
		if (isPluggedIn) {
			this.isTurnedOn = true;
			System.out.println("The appliance is turned on.");
		} else {
			System.out.println("The appliance must be plugged in.");
		}
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
}
