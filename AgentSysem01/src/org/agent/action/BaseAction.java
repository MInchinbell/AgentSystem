package org.agent.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.agent.common.Constants;
import org.agent.pojo.User;
import org.agent.service.user.UserService;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private UserService userService;
	private User currentUser;
	private String actionMessage;
	private PrintWriter out;

	public PrintWriter getOut() {
		return out;
	}

	public void setOut(PrintWriter out) {
		this.out = out;
	}

	public BaseAction() {
		this.setCurrentUser((User) this.getRequest().getSession()
				.getAttribute(Constants.SESSION_USER));// 当前登陆的用户的值
		this.getResponse().setCharacterEncoding("UTF-8");
		try {
			this.out = this.getResponse().getWriter();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private HttpServletResponse getResponse() {
		// TODO Auto-generated method stub
		return ServletActionContext.getResponse();
	}

	public HttpServletRequest getRequest() {
		// TODO Auto-generated method stub
		return ServletActionContext.getRequest();
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public String getActionMessage() {
		return actionMessage;
	}

	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
