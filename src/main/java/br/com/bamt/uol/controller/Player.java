package br.com.bamt.uol.controller;

import javax.validation.constraints.NotBlank;

import br.com.bamt.uol.model.Group;

public class Player {
	
	private String name;
	private String email;
	private String phone;
	private Group group;

	public Player(@NotBlank String name, @NotBlank String email, @NotBlank String phone, String group) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.group = Group.valueOf(group.toUpperCase());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
}
