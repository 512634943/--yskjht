package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIndexpartner<M extends BaseIndexpartner<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setIndexname(java.lang.String indexname) {
		set("indexname", indexname);
	}
	
	public java.lang.String getIndexname() {
		return getStr("indexname");
	}

	public void setPid(java.lang.String pid) {
		set("pid", pid);
	}
	
	public java.lang.String getPid() {
		return getStr("pid");
	}

}
