package utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    public String getData(String url ) throws IOException, InterruptedException {
    	  var client = HttpClient.newHttpClient();
	      var httpRequest = HttpRequest.newBuilder()
								        .uri(URI.create(url))
								        .GET()
								        .build();
	       var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		return response.body();
    }
}
