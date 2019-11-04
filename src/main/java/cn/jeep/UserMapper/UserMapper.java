package cn.jeep.UserMapper;

import java.util.List;


import cn.jeep.UserBean.User;


public interface UserMapper {
	//所有用户信息
	List<User> selectAllUserInfo();
	//登录
	User login(User user);
	//查询登陆用户的购物车
	Integer gouCarCount(String uid);
}
