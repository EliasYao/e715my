package tw.com.softleader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class boardCategories {

	@Override
	public String toString() {
		return categoryId+","+name+","+dateCreated;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categradlegoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Id
	private Integer	categoryId;
	private String name;
	private java.util.Date dateCreated;
}
