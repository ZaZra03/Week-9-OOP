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

		System.out.print("\nSelect your Electric Fan's type: ");
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

		System.out.println("");
	}
}
