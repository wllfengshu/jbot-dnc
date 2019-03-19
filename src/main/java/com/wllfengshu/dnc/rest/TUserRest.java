package com.wllfengshu.dnc.rest;

import com.wllfengshu.dnc.service.TUserService;
import com.wllfengshu.dnc.exception.CustomException;
import com.wllfengshu.dnc.entity.TUser;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@RequestMapping("/tUsers")
public class TUserRest {

	@Autowired
	private TUserService tUserService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@ApiOperation(value = "插入",httpMethod = "POST")
	@ApiImplicitParam(name = "sessionId", value = "SessionId",required = true, dataType = "string",paramType = "header")
	@ApiResponses({
		@ApiResponse(code=400, message="IllegalParam")
	})
	@RequestMapping(value = "/tUser",method = RequestMethod.POST)
	public Map<String, Object> insert(
		@RequestHeader(value = "sessionId") String sessionId,
		HttpServletRequest request,
		HttpServletResponse response,
		@RequestBody TUser entity)throws CustomException{
		logger.info("insert entity:{}",entity);
		return tUserService.insert(entity,sessionId);
	}

	@ApiOperation(value = "删除",httpMethod = "DELETE")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "int",paramType = "path"),
		@ApiImplicitParam(name = "sessionId", value = "SessionId", required = true, dataType = "string", paramType = "header")
	})
	@ApiResponses({
		@ApiResponse(code=400, message="IllegalParam")
	})
	@RequestMapping(value = "/tUser/{id}",method = RequestMethod.DELETE)
	public Map<String, Object> delete(
		@PathVariable("id") Integer id,
		@RequestHeader(value = "sessionId") String sessionId,
		HttpServletRequest request,
		HttpServletResponse response)throws CustomException{
		logger.info("delete id:{}",id);
		return tUserService.delete(id,sessionId);
	}

	@ApiOperation(value = "修改",httpMethod = "PUT")
	@ApiImplicitParam(name = "sessionId", value = "SessionId",required = true, dataType = "string",paramType = "header")
	@ApiResponses({
		@ApiResponse(code=400, message="IllegalParam")
	})
	@RequestMapping(value = "/tUser",method = RequestMethod.PUT)
	public Map<String, Object> update(
		@RequestHeader(value = "sessionId") String sessionId,
		HttpServletRequest request,
		HttpServletResponse response,
		@RequestBody TUser entity)throws CustomException{
		logger.info("update entity:{}",entity);
		return tUserService.update(entity,sessionId);
	}

	@ApiOperation(value = "按ID查询",httpMethod = "GET")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "int",paramType = "path"),
		@ApiImplicitParam(name = "sessionId", value = "SessionId",required = true, dataType = "string",paramType = "header")
	})
	@ApiResponses({
		@ApiResponse(code=400, message="IllegalParam")
	})
	@RequestMapping(value = "/tUser/{id}",method = RequestMethod.GET)
	public Map<String, Object> select(
		@PathVariable("id") Integer id,
		@RequestHeader(value = "sessionId") String sessionId,
		HttpServletRequest request,
		HttpServletResponse response)throws CustomException{
		logger.info("select id:{}",id);
		return tUserService.select(id,sessionId);
	}

	@ApiOperation(value = "查询",httpMethod = "GET")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "pageNo",value = "页数(从0开始，默认0)", dataType = "int",paramType = "query"),
		@ApiImplicitParam(name = "pageSize",value = "每页的数量(默认10)", dataType = "int",paramType = "query"),
		@ApiImplicitParam(name = "sessionId", value = "SessionId",required = true, dataType = "string",paramType = "header")
	})
	 @ApiResponses({
		@ApiResponse(code=400, message="IllegalParam")
	})
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public Map<String, Object> selects(
		@RequestParam(value = "pageNo",required = false,defaultValue = "0") Integer pageNo,
		@RequestParam(value = "pageSize",required = false,defaultValue = "10") Integer pageSize,
		@RequestHeader(value = "sessionId") String sessionId,
		HttpServletRequest request,
		HttpServletResponse response)throws CustomException{
		Map<String,Object> params = new HashMap<>();
		params.put("pageNo",pageNo);
		params.put("pageSize",pageSize);
		logger.info("selects params:{}",params);
		return tUserService.selects(params,sessionId);
	}

}
