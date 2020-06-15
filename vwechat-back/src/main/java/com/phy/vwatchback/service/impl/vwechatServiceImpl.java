package com.phy.vwatchback.service.impl;

import com.phy.vwatchback.dao.vwechatMapper;
import com.phy.vwatchback.service.vwechatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author PHY
 */
@Service
public class vwechatServiceImpl implements vwechatService {
    @Resource
    vwechatMapper vwechatMapper;

}
