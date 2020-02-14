package model.info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InfoStation {	
   @SerializedName("station_id")
   @Expose
   private String station_id;
   @SerializedName("name")
   @Expose   
   private String name;
   @SerializedName("address")
   @Expose
   private String address;
   @SerializedName("lat")
   @Expose
   private String lat;
   @SerializedName("lon")
   @Expose
   private String lon;
   @SerializedName("capacity")
   @Expose
   private String capacity;
   
 public String getStation_id() {
	return station_id;
}
public void setStation_id(String station_id) {
	this.station_id = station_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLat() {
	return lat;
}
public void setLat(String lat) {
	this.lat = lat;
}
public String getLon() {
	return lon;
}
public void setLon(String lon) {
	this.lon = lon;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}

}
