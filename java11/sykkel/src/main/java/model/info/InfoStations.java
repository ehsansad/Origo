package model.info;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InfoStations {
	@SerializedName("stations")
	@Expose
	private List<InfoStation> stations;

	public List<InfoStation> getInfoStations() {
		return stations;
	}

	public void setInfoStations(List<InfoStation> infoStations) {
		this.stations = infoStations;
	}
}
