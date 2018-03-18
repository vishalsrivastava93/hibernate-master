package com.example.HibernateExample.Model;

import javax.persistence.*;

/**
 * 
 * @author Vishal Srivastava
 *
 */

@Entity
public class Attribute {

	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ATTRIBUTE_ID")
	String attributeId;
	@Column(name="NAME")
	String name;
	@Column(name="VALUE")
	String value;
	@Column(name="UPDATED_TIME")
	String updatedAt;

	public Attribute(String attributeId, String name, String value, String createdAt) {
		super();
		this.attributeId = attributeId;
		this.name = name;
		this.value = value;
		this.updatedAt = createdAt;
	}

	public String getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCreatedAt() {
		return updatedAt;
	}

	public void setCreatedAt(String createdAt) {
		this.updatedAt = createdAt;
	}

	@Override
	public String toString() {
		return "Attribute [attributeId=" + attributeId + ", name=" + name + ", value=" + value + ", createdAt="
				+ updatedAt + "]";
	}


}
