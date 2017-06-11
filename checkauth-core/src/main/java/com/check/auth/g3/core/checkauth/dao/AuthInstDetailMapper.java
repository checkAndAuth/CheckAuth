package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @desc 主机构信息
 * @author 
 *
 */
@Repository("authInstMainInfoMapper")
public interface AuthInstDetailMapper {
	/**
	 * 单笔插入
	 */
	public void insert(AuthInstDetailEntity authInstMainInfoEntity);


    /**
     * 机构批准号
     */
    public AuthInstDetailEntity selectDetailByInstCode(String instCode);


    /**
     * 机构名称
     */
    public AuthInstDetailEntity selectDetailByInstName(String instName);


    /**
     * 根据模糊查询条件获取机构认证数量
     */
    public Long selectCountByFuzzyMap(Map<String, Object> map);

    /**
     * 模糊查询
     * 按instName、busiScopeName、districtCodeName模糊查询
     */
    public List<AuthInstDetailEntity> selectDetailListByFuzzyMap(Map<String,Object> map);

}
