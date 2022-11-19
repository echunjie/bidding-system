package cn.sx.ebj.bidding.common.core;

import cn.sx.ebj.bidding.common.utils.IPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 控制器基类
 *
 * @name: BaseController
 * @author: chunjie
 * @date: 2022-11-12 18:57
 **/

public abstract class BaseController {
    protected Logger log = LoggerFactory.getLogger(BaseController.class);
    @Resource
    protected HttpServletRequest request;

    protected String getIp(){
        return IPUtils.getIpAddr(request);
    }


}
