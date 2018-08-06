/** 
 * <pre>项目名称:maven-model 
 * 文件名称:TreeBean.java 
 * 包名:com.hgc.model.tree 
 * 创建日期:2018年5月8日下午6:31:02 
 * Copyright (c) 2018, aiyuelv@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * <pre>项目名称：maven-model    
 * 类名称：TreeBean    
 * 类描述：    
 * 创建人：黄根潮
 * 创建时间：2018年5月8日 下午6:31:02    
 * 修改人：黄根潮
 * 修改时间：2018年5月8日 下午6:31:02    
 * 修改备注：       
 * @version </pre>    
 */
public class TreeBean implements Serializable{
	private static final long seriaLversionUID=1L;

	private String id;
	private String text;
	private String pid;
	private String url;
	private String iconCls;
	private List<TreeBean> children =new ArrayList<TreeBean>();
	private Boolean checked=false;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public static long getSerialversionuid() {
		return seriaLversionUID;
	}
	public List<TreeBean> getChildren() {
		return children;
	}
	public void setChildren(List<TreeBean> children) {
		this.children = children;
	}

	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "TreeBean [id=" + id + ", text=" + text + ", pid=" + pid + ", url=" + url + ", iconCls=" + iconCls
				+ ", children=" + children + ", checked=" + checked + "]";
	}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeBean treeBean = (TreeBean) o;

        return id.equals(treeBean.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
	
