package model.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusStation {
	@SerializedName("station_id")
	@Expose
	private String station_id;
	@SerializedName("is_installed")
	@Expose
	private String is_installed;
	@SerializedName("is_renting")
	@Expose
	private String is_renting;
	@SerializedName("is_returning")
	@Expose
	private String is_returning;
	@SerializedName("last_reported")
	@Expose
	private String last_reported;
	@SerializedName("num_bikes_available")
	@Expose
	private String num_bikes_available;
	@SerializedName("num_docks_available")
	@Expose
	private String num_docks_available;
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public String getIs_installed() {
		return is_installed;
	}
	public void setIs_installed(String is_installed) {
		this.is_installed = is_installed;
	}
	public String getIs_renting() {
		return is_renting;
	}
	public void setIs_renting(String is_renting) {
		this.is_renting = is_renting;
	}
	public String getIs_returning() {
		return is_returning;
	}
	public void setIs_returning(String is_returning) {
		this.is_returning = is_returning;
	}
	public String getLast_reported() {
		return last_reported;
	}
	public void setLast_reported(String last_reported) {
		this.last_reported = last_reported;
	}
	public String getNum_bikes_available() {
		return num_bikes_available;
	}
	public void setNum_bikes_available(String num_bikes_available) {
		this.num_bikes_available = num_bikes_available;
	}
	public String getNum_docks_available() {
		return num_docks_available;
	}
	public void setNum_docks_available(String num_docks_available) {
		this.num_docks_available = num_docks_available;
	}
	
}
