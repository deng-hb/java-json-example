/**
  * Copyright 2015 denghb.com 
  */
package com.denghb.json.test;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2015-12-31 13:49:14
 * 
 * @website denghb.com
 */
public class JsonResult {

	private String name;
	private Date addtime;
	private String username;
	private int id;
	private Items items;
	private List<String> sss;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Items getItems() {
		return items;
	}

	public void setSss(List<String> sss) {
		this.sss = sss;
	}

	public List<String> getSss() {
		return sss;
	}

}