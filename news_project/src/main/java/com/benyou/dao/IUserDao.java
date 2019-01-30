package com.benyou.dao;

import java.util.List;

import com.benyou.model.User;



public interface IUserDao {
	
	/**查询用户信息，用于判断登录
	 * @param User
	 * @return User
	 */
	public User getUser(User user);
	
	
	/**查询所有用户信息，用于管理界面显示
	 * @return List<User>
	 *
	 */
	public List<User> getAll();
	
	
	
	/**添加一个User信息
	 * @author benyou
	 *
	 */
	
	
	public int addUser(User user);
	
	/**删除一条用户信息
	 * @param User
	 * @return int 
	 */
	
	public int delUser(User user);
	
	/**获取指定用户信息
	 * @param user
	 * @return user
	 */
	

	public User getAuser(User user);
	
	/**修改用户信息
	 * @param user
	 * @return int 
	 */
	
	public int updateUser(User user);
	
	/**模糊查询，用户查询界面显示
	 * @param user
	 * @return List<user>
	 */
	public List<User> getListUser(User user);
	
}
