package cn.jeep.UserMapper;

import java.util.List;


import cn.jeep.UserBean.User;


public interface UserMapper {
	//�����û���Ϣ
	List<User> selectAllUserInfo();
	//��¼
	User login(User user);
	//��ѯ��½�û��Ĺ��ﳵ
	Integer gouCarCount(String uid);
}
