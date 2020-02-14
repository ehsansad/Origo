package model.desc;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
	@SerializedName("nb")
	@Expose
	private Nb nb;

	public Nb getNb() {
	return nb;
	}

	public void setNb(Nb nb) {
	this.nb = nb;
	}
}
