package model.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusDesc {
	@SerializedName("data")
	@Expose
	private StatusData data;
	@SerializedName("ttl")
	@Expose
	private Integer ttl;
	@SerializedName("last_updated")
	@Expose
	private Integer lastUpdated;

	public StatusData getData() {
	return data;
	}

	public void setData(StatusData data) {
	this.data = data;
	}

	public Integer getTtl() {
	return ttl;
	}

	public void setTtl(Integer ttl) {
	this.ttl = ttl;
	}

	public Integer getLastUpdated() {
	return lastUpdated;
	}

	public void setLastUpdated(Integer lastUpdated) {
	this.lastUpdated = lastUpdated;
	}

}
