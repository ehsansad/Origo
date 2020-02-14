package utils;

import java.util.List;

public class PrintTable {
    private String name;
    private String capacity;
    private String avilable;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getAvilable() {
		return avilable;
	}
	public void setAvilable(String avilable) {
		this.avilable = avilable;
	}
	
	public PrintTable(String name, String capacity, String avilable) {
	    this.setName(name);
	    this.setCapacity(capacity);
	    this.setAvilable(avilable);	    
	}
	
	public static  void printBikeHeader() {
	    System.out.println(String.format("%30s %25s %10s %25s %10s",  "Name", "|", "Capacity","|","Available"));
	    System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
	}
	public void printBikeList() {
	    System.out.println(String.format("%30s %25s %10s %25s %10s", this.getName(), "|", this.getCapacity(), "|", this.getAvilable()));
	}

	public static List<PrintTable> tableList(List<PrintTable> bikeList) {	   
	    return bikeList;
	}

}
