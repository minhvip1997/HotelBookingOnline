package com.hotel.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleId")
	private int roleId;
	@Column(name = "roleName")
	private String roleName;
	@Column(name = "role")
	private int role;
	@OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
	private List<Employee> employees=new ArrayList<Employee>();
	public Role(int roleId, String roleName, int role, List<Employee> employees) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.role = role;
		this.employees = employees;
	}
	public Role() {
		super();
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
