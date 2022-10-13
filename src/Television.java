public class Television extends Appliance {
	private int channel;
	private int volume;

	public Television(String model, int voltage, double wattage) {
		super(model, voltage, wattage);
		this.channel = 1;
		this.volume = 10;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void MoveChannelUp() {
		if (this.channel > 0) {
			this.channel += 1;
			System.out.println("Channel is moved to Channel " + this.channel);
		}
	}

	public void MoveChannelDown() {
		if (this.channel > 0) {
			this.channel -= 1;
			System.out.println("Channel is moved to Channel " + this.channel);
		}
	}
	
	public void MoveChannelAt(int channel) {
		if(channel > 0) {
			this.channel = channel;
			System.out.println("Channel is moved to Channel " + channel);
		}
	}

	public void IncreaseVolume() {
		this.volume += 1;
		System.out.println("Volume is increased by " + this.volume);
	}

	public void DecreaseVolume() {
		this.volume -= 1;
		System.out.println("Volume is decreased by " + this.volume);
	}
	@Override
	public void PlugIn() {
		super.setIsPluggedIn(true);
		System.out.println("The Television is plugged in.");
	}
	@Override
	public void PlugOut() {
		super.setIsPluggedIn(false);
		System.out.println("The Televisio is plugged out.");
	}
	@Override
	public void TurnOn() {
		super.setIsTurnedOn(true);
		System.out.println("The Television is turned on.");
	}
	@Override
	public void TurnOff(double hours) {
		this.ComputeConsumption(hours);
		System.out.println("Total Consumption: " + super.getConsumption());
		super.setIsTurnedOn(false);
		System.out.println("The Television is turned off.");
	}
}
