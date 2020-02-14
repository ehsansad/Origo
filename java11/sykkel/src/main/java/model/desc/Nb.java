package model.desc;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nb {
	@SerializedName("feeds")
	@Expose
	private List<Feed> feeds = null;

	public List<Feed> getFeeds() {
	return feeds;
	}

	public void setFeeds(List<Feed> feeds) {
	this.feeds = feeds;
    }
}
