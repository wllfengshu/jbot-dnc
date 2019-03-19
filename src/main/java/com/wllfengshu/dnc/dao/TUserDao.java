package com.wllfengshu.dnc.dao;

import com.wllfengshu.dnc.entity.TUser;
import com.wllfengshu.dnc.utils.MyMapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface TUserDao extends MyMapper<TUser> {

	List<TUser> selectTUsers(Map<String, Object> params);
	Integer selectTUsersCount(Map<String, Object> params);

}
