package model.desc;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AutoDesc {
	@SerializedName("data")
	@Expose
	private Data data;
	@SerializedName("ttl")
	@Expose
	private Integer ttl;
	@SerializedName("last_updated")
	@Expose
	private Integer lastUpdated;

	public Data getData() {
	return data;
	}

	public void setData(Data data) {
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
