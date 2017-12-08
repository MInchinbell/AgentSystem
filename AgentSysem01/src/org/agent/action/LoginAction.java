package org.agent.action;

import java.util.Date;

import org.agent.common.Constants;
import org.agent.common.MD5;
import org.agent.pojo.User;

public class LoginAction extends BaseAction {

	// 接收ormv表单
	private User user;

	public String login() {

		if (user != null) {
			// 密码加密的处理
			user.setUserPassword(MD5.MD5Encode(user.getUserPassword()));
			User _user = this.getUserService().getLoginUser(user);
			if (_user != null) {

				this.getRequest().getSession()
						.setAttribute(Constants.SESSION_USER, _user);// 保存session
				_user.setLastLoginTime(new Date());
				this.getUserService().modifyUser(_user);// 更新用户状态
				return SUCCESS;
			} else {
				return INPUT;
			}

		}

		return INPUT;
	}

	public String checkUser() {
		/*
		 * noextusercode errorpwd failed success
		 */
		String flag = "failed";
		if (user != null && user.getUserCode() != "") {

			user.setUserPassword(MD5.MD5Encode(user.getUserPassword()));
			int n = this.getUserService().IsExitloginUser(user);
			if (n == 0) {
				flag = "noexitusercode";
			} else if (this.getUserService().getLoginUser(user) == null) {
				flag = "errorpwd";
			} else {
				flag = "success";
			}
		}
		this.getOut().write(flag);
		return null;// Strots2不再进行页面的显示处理

	}

	public String main() {
		// 加权限验证

		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void modifyPwd() {
		// _user:已经登陆用户。user：页面接收的
		User _user = (User) this.getRequest().getSession()
				.getAttribute(Constants.SESSION_USER);
		// 老密码用userName属性传递过来
		if (MD5.MD5Encode(user.getUserName()).equals(_user.getUserPassword())) {
			_user.setUserPassword(MD5.MD5Encode(user.getUserPassword()));
			if (this.getUserService().modifyUser(_user) > 0) {
				this.getOut().print("success");
				this.getOut().flush();
				this.getOut().close();
			}
		}
	}

	public String exit() {
		System.out.print("静安里");
		this.getRequest().getSession().invalidate();
		this.getRequest().getSession().removeAttribute(Constants.SESSION_USER);
		return "success";
	}
}
