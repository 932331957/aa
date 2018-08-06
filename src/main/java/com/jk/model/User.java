/** 
 * <pre>项目名称:maven-hgc 
 * 文件名称:user.java 
 * 包名:com.hgc.model.user 
 * 创建日期:2018年5月7日下午10:35:16 
 * Copyright (c) 2018, aiyuelv@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven-hgc    
 * 类名称：user    
 * 类描述：    
 * 创建人：黄根潮
 * 创建时间：2018年5月7日 下午10:35:16    
 * 修改人：黄根潮
 * 修改时间：2018年5月7日 下午10:35:16    
 * 修改备注：       
 * @version </pre>    
 */
public class User implements Serializable{
	private static final long serialVersionUID = -5857892811466862632L;
	private String id;
	  private String username;
	  private String accountnumber;
	private String userimg;
	private String userpwd;
	private String userstatus;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getUserimg() {
		return userimg;
	}

	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		return id.equals(user.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", username='" + username + '\'' +
				", accountnumber='" + accountnumber + '\'' +
				", userimg='" + userimg + '\'' +
				", userpwd='" + userpwd + '\'' +
				", userstatus='" + userstatus + '\'' +
				'}';
	}
}
