import json
import requests
import urllib

import info as caseInfo


def getJsonData(url):
    operUrl = urllib.request.urlopen(url)
    if(operUrl.getcode()==200):
        data = operUrl.read()
        jsonData = json.loads(data)
    else:
        print("Error receiving data", operUrl.getcode())
    return jsonData

def findStationInfo(id):
    for station in caseInfo.setupInfo.stations_stat["data"]["stations"]:
        if (station["station_id"] == id):
            return station 
def extractStationData(stationUrls):
    for data in stationUrls["data"]["nb"]["feeds"]:
        if data["name"] == "station_information":
            caseInfo.setupInfo.stations_info = getJsonData(data["url"])
        elif data["name"] == "station_status":
            caseInfo.setupInfo.stations_stat = getJsonData(data["url"])
    

def main():
    autoDiscInfo = getJsonData(caseInfo.setupInfo.auto_desc_url)
    extractStationData(autoDiscInfo)
    print(f'Station name        Available bikes    Docks')
    print(f'=========================================')
    for s_info in caseInfo.setupInfo.stations_info["data"]["stations"]:
        data = findStationInfo(s_info["station_id"])
        print("{}        {}    {}".format(s_info["name"],data["num_bikes_available"],data["num_docks_available"]))
        

if __name__== "__main__":
  main()