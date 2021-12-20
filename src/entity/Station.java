package entity;

public class Station {
	/**
	 * station attribute
	 */
	 private int id;
	 private String stationName;
	 private String stationAddress;
	 private int bikesNumber;
	 private int ebikesNumber;
	 private int twinbikesNumber;
	 
	 public Station() {
		  
	  }
	 
	 public Station(int id, String stationName, String stationAddress, 
			 int bikesNumber, int ebikesNumber, int twinbikesNumber) {
		 this.id = id;
		 this.stationName = stationName;
		 this.stationAddress = stationAddress;
		 this.bikesNumber = bikesNumber;
		 this.ebikesNumber = ebikesNumber;
		 this.twinbikesNumber = twinbikesNumber;
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationAddress() {
		return stationAddress;
	}

	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}

	public int getBikesNumber() {
		return bikesNumber;
	}

	public void setBikesNumber(int bikesNumber) {
		this.bikesNumber = bikesNumber;
	}

	public int getEbikesNumber() {
		return ebikesNumber;
	}

	public void setEbikesNumber(int ebikesNumber) {
		this.ebikesNumber = ebikesNumber;
	}

	public int getTwinbikesNumber() {
		return twinbikesNumber;
	}

	public void setTwinbikesNumber(int twinbikesNumber) {
		this.twinbikesNumber = twinbikesNumber;
	}
 
}
