package com.wllfengshu.dnc.service;

import com.wllfengshu.dnc.entity.TUser;
import com.wllfengshu.dnc.exception.CustomException;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public interface TUserService {

	Map<String, Object> insert(TUser entity,String sessionId)throws CustomException;
	Map<String, Object> delete(Integer id,String sessionId)throws CustomException;
	Map<String, Object> update(TUser entity,String sessionId)throws CustomException;
	Map<String, Object> select(Integer id,String sessionId)throws CustomException;
	Map<String, Object> selects(Map<String, Object> params,String sessionId)throws CustomException;

}
