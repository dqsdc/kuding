package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Grant;
import com.qilinxx.kuding.domain.model.vo.GrantVo;

import java.util.List;

public interface GrantService {
    List<GrantVo> selectAllGrant();

    Grant selectGrantById(String id);

    String addGrant(String sName,String sPhone,String tName, String cName);
}
