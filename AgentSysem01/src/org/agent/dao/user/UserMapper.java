package org.agent.dao.user;

import java.util.List;

import org.agent.pojo.User;

public interface UserMapper {
	// 查询
	public List<User> getUserLiset(User user);

	// 单个
	public User getUser(User user);

	public int addUser(User user);

	public int modifyUser(User user);

	public int deleteUser(User user);

	public int count(User user);

	public int IsExitloginUser(User user);// 查询用户userCode是否存在 是否存在1为存在0为不存在

	public User getLonginUser(User user);
}
