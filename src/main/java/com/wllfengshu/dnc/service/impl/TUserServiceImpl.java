package com.wllfengshu.dnc.service.impl;

import com.wllfengshu.dnc.service.TUserService;
import com.wllfengshu.dnc.exception.CustomException;
import com.wllfengshu.dnc.dao.TUserDao;
import com.wllfengshu.dnc.entity.TUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TUserServiceImpl implements TUserService {

	@Autowired
	private TUserDao tUserDao;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Map<String, Object> insert(TUser entity,String sessionId)throws CustomException{
		logger.info("insert entity:{}",entity);
		Map<String, Object> result = new HashMap<>();
		tUserDao.insert(entity);
		return result;
	}

	@Override
	public Map<String, Object> delete(Integer id,String sessionId)throws CustomException{
		logger.info("delete id:{}",id);
		Map<String, Object> result = new HashMap<>();
		tUserDao.deleteByPrimaryKey(id);
		return result;
	}

	@Override
	public Map<String, Object> update(TUser entity,String sessionId)throws CustomException{
		logger.info("update entity:{}",entity);
		Map<String, Object> result = new HashMap<>();
		tUserDao.updateByPrimaryKey(entity);
		return result;
	}

	@Override
	public Map<String, Object> select(Integer id,String sessionId)throws CustomException{
		logger.info("select id:{}",id);
		Map<String, Object> result = new HashMap<>();
		result.put("data",tUserDao.selectByPrimaryKey(id));
		return result;
	}

	@Override
	public Map<String, Object> selects(Map<String, Object> params,String sessionId)throws CustomException{
		logger.info("selects params:{}",params);
		Map<String, Object> result = new HashMap<>();
		result.put("data",tUserDao.selectTUsers(params));
		result.put("total",tUserDao.selectTUsersCount(params));
		return result;
	}

}
