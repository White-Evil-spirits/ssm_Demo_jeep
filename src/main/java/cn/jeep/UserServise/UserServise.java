package cn.jeep.UserServise;

import java.util.List;

import cn.jeep.UserBean.User;

public interface UserServise {
	//�����û���Ϣ
	List<User> selectAllUserInfo();
	//��¼
	User login(User user);
	//��ѯ��½�û��Ĺ��ﳵ
	Integer gouCarCount(String uid);
}
