package model.status;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusData {
	@SerializedName("stations")
	@Expose
	private List<StatusStation> stations;

	public List<StatusStation> getStatusStations() {
		return stations;
	}

	public void setStatusStations(List<StatusStation> statusStations) {
		this.stations = statusStations;
	}

	
}
