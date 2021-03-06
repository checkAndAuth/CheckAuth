package com.check.auth.g3.core.checkauth.service;

import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;

import java.util.Map;

public interface AuthInstService {

    public void insertAuthInst(AuthInstEntity authInstDirEntity);
    
    public AuthInstEntity selectAuthInstByInstCode(String instCode);

    public PageDTO<AuthInstEntity>  selectListByPage(Map<String, Object> queryMap);

}
