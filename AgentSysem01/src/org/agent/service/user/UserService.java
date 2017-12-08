package org.agent.service.user;

import java.util.List;

import org.agent.pojo.User;

public interface UserService {

	public List<User> getUserLiset(User user);// 获取所有用户

	public User getUser(User user);// 获取单个用户

	public int addUser(User user);// 获取单个

	public int modifyUser(User user);// 修改

	public int deleteUser(User user);// 删除

	public int count(User user);// 总数

	public int IsExitloginUser(User user);// 是否存在

	public User getLoginUser(User user);
}
