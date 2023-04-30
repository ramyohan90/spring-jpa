package com.org.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Column(name = "createdate")
	private LocalDateTime createDate;
	
	@Column(name = "updatedate")
	private LocalDateTime updateDate;
	
	public BaseEntity() {
		super();
		this.createDate = LocalDateTime.now();
		this.updateDate = null;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
