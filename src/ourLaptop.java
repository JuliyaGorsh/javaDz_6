


public class ourLaptop {
	String serialNumber;
	String model;
String colour;
		int ram;
		int hdd;

		String oSystem;
		String cpu;

public ourLaptop(String serialNumber, String model, String colour, int ram, int hdd, String oSystem, String cpu){
		this.serialNumber = serialNumber;
		this.model = model;
		this.colour = colour;
		this.ram = ram;
		this.hdd = hdd;
		this.oSystem = oSystem;
		this.cpu = cpu;
		}
@Override
public String toString(){
		return model + " цвет: " + colour + " ОС: " + oSystem + " " + ram + "Gb, " + hdd + "Gb, " + cpu + ", " + serialNumber;
		}
public boolean equalsOS(Object obj){
		if (this == obj){
		return true;
		}
		if (!(obj instanceof ourLaptop)){
		return false;
		}
		ourLaptop laptop = (ourLaptop) obj;
		if (oSystem.equals(laptop.oSystem)){
		return true;
		}
		else{
		return false;
		}
		}
public String getColour() {
		return colour;
		}


public boolean equalsColore(Object obj){
	if (this == obj){
		return true;
	}
	if (!(obj instanceof ourLaptop)){
		return false;
	}
	ourLaptop laptop = (ourLaptop) obj;
	if (colour.equals(laptop.colour)){
		return true;
	}
	else{
		return false;
	}
}
	public boolean equalityRam(Object obj){
		if (this == obj){
			return true;
		}
		if (!(obj instanceof ourLaptop)){
			return false;
		}
		ourLaptop laptop = (ourLaptop) obj;
		if ((ram == laptop.ram)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean equalityHdd(Object obj){

		ourLaptop laptop = (ourLaptop) obj;
		if ((hdd >= laptop.hdd)){
			return true;
		}
		else{
			return false;
		}
	}
}
