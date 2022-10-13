public class Television extends Appliance {
	private int channel;
	private int volume;

	public Television(String model, int voltage, double wattage) {
		super(model, voltage, wattage);
		this.channel = 1;
		this.volume = 10;
	}

		public void MoveChannelUp() {
		if (super.getIsTurnedOn()) {
			if (this.channel > 0) {
				this.channel += 1;
				System.out.println("Channel is moved to Channel " + this.channel);
			}
		} else {
			System.out.println("The Television must be turned on.");
		}
	}

	public void MoveChannelDown() {
		if (super.getIsTurnedOn()) {
			if (this.channel > 0) {
				this.channel -= 1;
				System.out.println("Channel is moved to Channel " + this.channel);
			}
		} else {
			System.out.println("The Television must be turned on.");
		}
	}

	public void MoveChannelAt(int channel) {
		if (super.getIsTurnedOn()) {
			if (channel > 0) {
				this.channel = channel;
				System.out.println("Channel is moved to Channel " + channel);
			}
		} else {
			System.out.println("The Television must be turned on.");
		}
	}

	public void IncreaseVolume() {
		if (super.getIsTurnedOn()) {
			this.volume += 1;
			System.out.println("Volume is increased by " + this.volume);
		} else {
			System.out.println("The Television must be turned on.");
		}
	}

	public void DecreaseVolume() {
		if (super.getIsTurnedOn()) {
			this.volume -= 1;
			System.out.println("Volume is decreased by " + this.volume);
		} else {
			System.out.println("The Television must be turned on.");
		}
	}

	@Override
	public void PlugIn() {
		super.setIsPluggedIn(true);
		System.out.println("The Television is plugged in.");
	}

	@Override
	public void PlugOut() {
		super.setIsPluggedIn(false);
		System.out.println("The Television is plugged out.");
	}

	@Override
	public void TurnOn() {
		if(super.getIsPluggedIn()){
		super.setIsTurnedOn(true);
		System.out.println("The Television is turned on.");
		}
		else{
		System.out.println("The Television must be plugged in.");
		}
	}

	@Override
	public void TurnOff(double hours) {
		this.ComputeConsumption(hours);
		System.out.println("Total Consumption: " + super.getConsumption());
		super.setIsTurnedOn(false);
		System.out.println("The Television is turned off.");
	}
	
	@Override
	public void DisplayInformation() {
		System.out.println("\nTV Model: " + super.getModel());
		System.out.println("TV Voltage: " + super.getVoltage());
		System.out.println("TV Wattage: " + super.getWattage());
	}
}
