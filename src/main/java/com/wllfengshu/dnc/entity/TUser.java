package com.wllfengshu.dnc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_user")
public class TUser implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@Id
	@Column(name = "id")
	private Integer id;

 	/**
	 * 用户名
	 */
	@Column(name = "username")
	private String username;

 	/**
	 * 
	 */
	@Column(name = "password")
	private String password;

 	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	@Column(name = "create_time")
	private Date createTime;

 	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	@Column(name = "update_time")
	private Date updateTime;

 	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	@Column(name = "delete_time")
	private Date deleteTime;

 	/**
	 * 
	 */
	@Column(name = "is_delete")
	private Integer isDelete;

 
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

}
