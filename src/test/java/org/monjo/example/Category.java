package org.monjo.example;

import org.monjo.core.annotations.Entity;

@Entity
public class Category extends AbstractObject {
	
	private String name;

	private Long weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
