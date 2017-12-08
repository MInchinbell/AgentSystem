package org.agent.pojo;

import java.util.Date;

public class User extends Base {
	/*
	  `userCode` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户CODE',
	  `userName` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名称',
	  `userPassword` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户登录密码',
	  `creationTime` datetime NOT NULL COMMENT '注册时间',
	  `lastLoginTime` datetime DEFAULT '2013-01-01 00:00:01' COMMENT '最后登录时间',
	  `createdBy` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '创建者',
	  `lastUpdateTime` datetime DEFAULT '2013-01-01 00:00:01' COMMENT '最后修改时间',
	  `isStart` int(11) DEFAULT '1' COMMENT '是否启动1为启用0为不启用',
	  `roleId` bigint(20) NOT NULL DEFAULT '0' COMMENT '所属角色',*/
	private String userCode;
	private String userName;
	private String userPassword;
	private Date creationTime;
	private Date    lastLoginTime;
	private String createdBy;
	private Date lastUpdateTime;
	private  String isStart;
	private  String roleId;
	
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getIsStart() {
		return isStart;
	}
	public void setIsStart(String isStart) {
		this.isStart = isStart;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
}
