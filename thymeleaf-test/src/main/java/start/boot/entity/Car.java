package start.boot.entity;

import java.util.Date;

public class Car {
	private String name;
	private String photo;
	private Date createTime;
	
	public Car() {
		super();
	}
	public Car(String name, String photo, Date createTime) {
		super();
		this.name = name;
		this.photo = photo;
		this.createTime = createTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
