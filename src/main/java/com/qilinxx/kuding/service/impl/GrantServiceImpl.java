package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.GrantMapper;
import com.qilinxx.kuding.service.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrantServiceImpl implements GrantService {
    @Autowired
    private GrantMapper grantMapper;
}
