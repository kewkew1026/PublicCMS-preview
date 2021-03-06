package com.publiccms.entities.sys;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * SystemMoudle generated by hbm2java
 */
@Entity
@Table(name = "sys_moudle")
public class SysMoudle implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratorColumn(title = "ID")
	private Integer id;
	@GeneratorColumn(title = "名称")
	private String name;
	@GeneratorColumn(title = "地址")
	private String url;
	@GeneratorColumn(title = "授权地址")
	private String authorizedUrl;
	@GeneratorColumn(title = "附加")
	private String attached;
	@GeneratorColumn(title = "父模块", condition = true)
	private Integer parentId;
	@GeneratorColumn(title = "排序")
	private int sort;

	public SysMoudle() {
	}

	public SysMoudle(String name, int sort) {
		this.name = name;
		this.sort = sort;
	}

	public SysMoudle(String name, String url, String authorizedUrl, String attached, Integer parentId, int sort) {
		this.name = name;
		this.url = url;
		this.authorizedUrl = authorizedUrl;
		this.attached = attached;
		this.parentId = parentId;
		this.sort = sort;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "authorized_url", length = 65535)
	public String getAuthorizedUrl() {
		return this.authorizedUrl;
	}

	public void setAuthorizedUrl(String authorizedUrl) {
		this.authorizedUrl = authorizedUrl;
	}

	@Column(name = "attached", length = 300)
	public String getAttached() {
		return this.attached;
	}

	public void setAttached(String attached) {
		this.attached = attached;
	}

	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "sort", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

}
