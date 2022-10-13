import java.io.*;

public class Main {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String modelTV;
		int voltageTV;
		double wattageTV;
		int voltageElectricFan;
		double wattageElectricFan;
		int typeElectricFan;

		System.out.println("Create your Television.");
		System.out.print("Enter your TV's model: ");
		modelTV = in.readLine();

		while (true) {
			try {
				System.out.print("ENter your TV's voltage: ");
				voltageTV = Integer.parseInt(in.readLine());
				if (voltageTV <= 0) {
					System.out.println("\nError. Value cannot be zero or negative.\n");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\nError. Please input valid characters.\n");
			}
		}

		while (true) {
			try {
				System.out.print("Enter your TV's wattage: ");
				wattageTV = Double.parseDouble(in.readLine());
				if (wattageTV <= 0) {
					System.out.println("\nError. Value cannot be zero or negative.\n");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\nError. Please input valid characters.\n");
			}
		}

		Television objTelevision = new Television(modelTV, voltageTV, wattageTV);

		System.out.println("\nCreate your Electric Fan.");
		System.out.print("Enter your Electric Fan's model: ");
		String modelElectricFan = in.readLine();

		while (true) {
			try {
				System.out.print("Enter your Electric Fan's voltage: ");
				voltageElectricFan = Integer.parseInt(in.readLine());
				if (voltageTV <= 0) {
					System.out.println("\nError. Value cannot be zero or negative.\n");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\nError. Please input valid characters.\n");
			}
		}

		while (true) {
			try {
				System.out.print("Enter your Electric Fan's wattage: ");
				wattageElectricFan = Double.parseDouble(in.readLine());
				if (wattageTV <= 0) {
					System.out.println("\nError. Value cannot be zero or negative.\n");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\nError. Please input valid characters.\n");
			}
		}

		ElectricFan objElectricFan = new ElectricFan(modelElectricFan, voltageElectricFan, wattageElectricFan);

		System.out.println("\nSelect your Electric Fan's type: ");
		System.out.println("1) Desk");
		System.out.println("2) Stand");
		System.out.println("3) Wall");
		System.out.println("4) Ceiling");
		System.out.println("5) Clip");
		System.out.print("\nEnter your input: ");
		typeElectricFan = Integer.parseInt(in.readLine());

		switch (typeElectricFan) {
		case 1:
			objElectricFan.setFanType(objElectricFan.getFanTypes(0));
			break;
		case 2:
			objElectricFan.setFanType(objElectricFan.getFanTypes(1));
			break;
		case 3:
			objElectricFan.setFanType(objElectricFan.getFanTypes(2));
			break;
		case 4:
			objElectricFan.setFanType(objElectricFan.getFanTypes(3));
			break;
		case 5:
			objElectricFan.setFanType(objElectricFan.getFanTypes(4));
			break;
		}

				
		while (true) {

			System.out.println("\nTV Model: ");
			System.out.println("TV Voltage: ");
			System.out.println("TV Wattage: ");
			System.out.println("\nTelevision controls: ");
			System.out.println("\n1) Move Channel Up");
			System.out.println("2) Move Channel Down");
			System.out.println("3) Change Channel At");
			System.out.println("4) Increase Volume");
			System.out.println("5) Decrease Volume");
			System.out.println("6) Turn on");
			System.out.println("7) Turn off");
			System.out.println("8) Plug in");
			System.out.println("9) Plug off");

			System.out.println("\nElectric Fan Model: ");
			System.out.println("Electric Fan Voltage: ");
			System.out.println("Electric Fan Wattage: ");
			System.out.println("\nElectric Fan controls: ");
			System.out.println("\n10) Change Speed");
			System.out.println("11) Change Max Speed");
			System.out.println("12) Turn on");
			System.out.println("13) Turn off");
			System.out.println("14) Plug in");
			System.out.println("15) Plug off");

			System.out.print("\nEnter your input: ");
			int command = Integer.parseInt(in.readLine());

			switch (command) {
			case 1:
				objTelevision.MoveChannelUp();
				break;
			case 2:
				objTelevision.MoveChannelDown();
				break;
			case 3:
				System.out.print("Enter a channel: ");
				int channel = Integer.parseInt(in.readLine());
				objTelevision.MoveChannelAt(channel);
				break;
			case 4:
				objTelevision.IncreaseVolume();
				break;
			case 5:
				objTelevision.DecreaseVolume();
				break;
			case 6:
				objTelevision.TurnOn();
				break;
			case 7:
				System.out.print("Enter the number of hours used: ");
				double tvHoursUsed = Double.parseDouble(in.readLine());
				objTelevision.TurnOff(tvHoursUsed);
				break;
			case 8:
				objTelevision.PlugIn();
				break;
			case 9:
				objTelevision.PlugOut();
				break;
			case 10:
				System.out.print("Enter fan speed: ");
				int fanSpeed = Integer.parseInt(in.readLine());
				objElectricFan.ChangeFanSpeed(fanSpeed);
				break;
			case 11:
				objElectricFan.ChangeFanMaxSpeed();
				break;
			case 12:
				objElectricFan.TurnOn();
				break;
			case 13:
				System.out.print("Enter the number of hours used: ");
				double fanHoursUsed = Double.parseDouble(in.readLine());
				objElectricFan.TurnOff(fanHoursUsed);
				break;
			case 14:
				objElectricFan.PlugIn();
				break;
			case 15:
				objElectricFan.PlugOut();
				break;
			}
		}
	}
}
