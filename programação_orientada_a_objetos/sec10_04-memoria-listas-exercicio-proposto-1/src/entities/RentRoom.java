package entities;

public class RentRoom {
	
	private String tenantName;
	private String tenantEmail;
	private int roomNumber;
	
	public RentRoom(String tenantName, String tenantEmail, int roomNumber) {
		super();
		this.tenantName = tenantName;
		this.tenantEmail = tenantEmail;
		this.roomNumber = roomNumber;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantEmail() {
		return tenantEmail;
	}

	public void setTenantEmail(String tenantEmail) {
		this.tenantEmail = tenantEmail;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}	

}
