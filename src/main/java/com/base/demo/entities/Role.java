package com.base.demo.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Role {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long rid;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users;

	@ManyToMany
    @JoinTable(
            name="role_modules",
            joinColumns = @JoinColumn(name="rid",referencedColumnName="rid"),
            inverseJoinColumns = @JoinColumn(name="mid",referencedColumnName="mid")
    )
	private Set<Module> modules;
	
	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
