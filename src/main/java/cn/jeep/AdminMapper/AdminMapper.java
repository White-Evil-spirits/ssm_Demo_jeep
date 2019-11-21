package cn.jeep.AdminMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jeep.AdminBean.candpBean;
import cn.jeep.AdminBean.lookCarNameBean;
import cn.jeep.CarBean.carPeizhi;
import cn.jeep.CarBean.peizhiColor;

public interface AdminMapper {
	//查看所有车名
	List<lookCarNameBean> lookCarName();
	//根据车id查询配置
	List<carPeizhi> lookpeizhi(String carid);
	//查看颜色
	List<peizhiColor> lookcolor(String pid);
	//详细颜色
	candpBean lookcolors(@Param("colorid")String colorid,@Param("pid")String pid);
}
