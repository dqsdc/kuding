package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.EvaluateMapper;
import com.qilinxx.kuding.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateMapper;
}
