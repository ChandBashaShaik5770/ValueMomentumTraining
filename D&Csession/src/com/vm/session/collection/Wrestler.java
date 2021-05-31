package com.vm.session.collection;

public class Wrestler
{
	private String name;
	private int weight;
	private double height;
	public Wrestler(String name, int weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Wrestler [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	
	

}
