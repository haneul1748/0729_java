package com.kh.idol.model.vo;

public class Idol {
	private String name;
	private String position;
	private String skill;
	public Idol(String name, String position, String skill) {
		super();
		this.name = name;
		this.position = position;
		this.skill = skill;
	}
	public Idol() {
		super();
	}
	@Override
	public String toString() {
		return "Idol [name=" + name + ", position=" + position + ", skill=" + skill + "]";
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPosition() {
		return position;
	}
	public final void setPosition(String position) {
		this.position = position;
	}
	public final String getSkill() {
		return skill;
	}
	public final void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
