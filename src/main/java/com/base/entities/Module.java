package com.base.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Module {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long mid;
	
	@ManyToMany
    @JoinTable(
            name="module_privilege",
            joinColumns = @JoinColumn(name="mid"),
            inverseJoinColumns = @JoinColumn(name="pid")
    )
	private Set<Privilege> privileges;
	
	private String mname;

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
}
