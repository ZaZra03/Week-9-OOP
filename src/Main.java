import java.io.*;

public class Main {
			
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		System.out.println("Create your Television.");
		System.out.print("Type your TV's model: ");
		String modelTV= in.readLine();
		System.out.print("Type your Tv's voltage: ");
		String voltageTV= in.readLine();
		System.out.print("Type your Tv's wattage: ");
		double wattageTV= Double.parseDouble(in.readLine());
		Television objTelevision = new Television(modelTV,voltageTV,wattageTV);
		
		System.out.println("\nCreate your Electric Fan.");
		System.out.print("Type your Electric Fan's model: ");
		String modelElectricFan = in.readLine();
		System.out.print("Type your Electric Fan's voltage: ");
		String voltageElectricFan = in.readLine();
		System.out.print("Type your Electric Fan's wattage: ");
		double wattageElectricFan = Double.parseDouble(in.readLine());
		ElectricFan objElectricFan = new ElectricFan(modelElectricFan,voltageElectricFan,wattageElectricFan);
		
		System.out.print("\nSelect your Electric Fan's type: ");
		System.out.println("1) Desk");
		System.out.println("2) Stand");
		System.out.println("3) Wall");
		System.out.println("4) Ceiling");
		System.out.println("5) Clip");
		System.out.print("Enter your input: ");	
		int typeElectricFan =  Integer.parseInt(in.readLine());
		
	
		switch(typeElectricFan) {
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
	}
}
