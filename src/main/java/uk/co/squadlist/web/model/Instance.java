package uk.co.squadlist.web.model;


public class Instance {
	
	private String id;
	private String name;
	private String timeZone;
	private boolean availabilityVisible;
	private Boolean beta;
		
	public Instance() {
	}
	
	public Instance(String id, String name, String timeZone, boolean availabilityVisible) {
		this.id = id;
		this.name = name;
		this.timeZone = timeZone;
		this.availabilityVisible = availabilityVisible;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	public boolean isAvailabilityVisible() {
		return availabilityVisible;
	}
	public void setAvailabilityVisible(boolean availabilityVisible) {
		this.availabilityVisible = availabilityVisible;
	}

	public Boolean getBeta() {
		return beta;
	}
	public void setBeta(Boolean beta) {
		this.beta = beta;
	}

	@Override
	public String toString() {
		return "Instance [id=" + id + ", name=" + name + ", timeZone="
				+ timeZone + ", availabilityVisible=" + availabilityVisible
				+ ", beta=" + beta + "]";
	}

}