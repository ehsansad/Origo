/**
 * 
 */
package one;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import model.desc.Feed;
import model.desc.AutoDesc;

import utils.Connection;
import utils.PrintTable;
import model.info.InfoDesc;
import model.info.InfoStation;
import model.status.StatusDesc;
import model.status.StatusStation;
/**
 * @author es
 *
 */
public class SykkelUtil {
    
	private static final String url = "https://gbfs.urbansharing.com/oslobysykkel.no/gbfs.json";
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  InfoDesc infoObj = null;		
		  StatusDesc statusObj = null;		 
	      Connection conn = new Connection();
	      try{
	      	var json = conn.getData(url);
	        AutoDesc obj = new Gson().fromJson(json, AutoDesc.class);                	            
	        for (Feed feed : obj.getData().getNb().getFeeds()) {
                if( feed.getName().contentEquals("station_information")) {                 	                
                	infoObj = new Gson().fromJson(conn.getData(feed.getUrl()), InfoDesc.class);
                } else if( feed.getName().contentEquals("station_status"))
                	statusObj = new Gson().fromJson(conn.getData(feed.getUrl()), StatusDesc.class);
	        }
	        printStationInfo(infoObj, statusObj); 
	      }catch(Exception e){
	          System.out.print(e.getMessage());
	      }


	  }
	 private static void printStationInfo(InfoDesc infoObj, StatusDesc statusObj) {		
		List<PrintTable> printlist = new ArrayList<>(); 
		for (InfoStation station : infoObj.getData().getInfoStations()) {
    		for (StatusStation ss : statusObj.getData().getStatusStations()) {
    			if (ss.getStation_id().equalsIgnoreCase(station.getStation_id())) {
    				printlist.add(new PrintTable(station.getName(), 
                                                 station.getCapacity(),
                                                 ss.getNum_bikes_available()));			
    			}     			
    		}    		
    	}
		PrintTable.printBikeHeader();
		PrintTable.tableList(printlist).forEach(PrintTable::printBikeList);
				

	 }
	 

	}
