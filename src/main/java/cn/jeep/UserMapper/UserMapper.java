package cn.jeep.UserMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jeep.UserBean.User;
import cn.jeep.UserBean.userGouCar;
import cn.jeep.UserBean.userMoreDingDan;


public interface UserMapper {
	//查询所有用户
	List<User> selectAllUserInfo();
	//登录
	User login(User user);
	//购物车ﳵ
	Integer gouCarCount(String uid);
	//查询身份证是否重复
	Integer isIdCode(String ushenfen);
	//注册新用户
	Integer saveUserInfo(User user);
	//用户购车加入商品
	Integer saveGouCar(userGouCar uGC);
	//查看购物车商品
	List<userGouCar> goGouCar(String uid);
	//删除一条购物车
	Integer deleteGouCar(String gid);
	//查询多条即将生成的订单
	List<userGouCar> moreSelectDingDan(List<String> list);
	//为了查看订单查询的一部分用户信息
	userMoreDingDan lookdingdanuser(@Param("uid")String uid);
}
