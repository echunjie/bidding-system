package cn.sx.ebj.bidding.controller;

import cn.sx.ebj.bidding.common.core.BaseController;
import cn.sx.ebj.bidding.common.data.Page;
import cn.sx.ebj.bidding.common.data.R;
import cn.sx.ebj.bidding.common.utils.ConvertUtils;
import cn.sx.ebj.bidding.common.utils.IPUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController extends BaseController {

    @GetMapping(value = {"", "/"})
    public String index(ModelMap map, HttpSession session) {
        session.setAttribute("aa","22");
        log.info("首页->{}", ConvertUtils.toStr(null));
        this.request.setAttribute("b","11");
        log.info("当前IP地址->{}", this.getIp());
        return "index";
    }

    @GetMapping("test")
    @ResponseBody
    public R<String> getIndex() {

        Page<Object> d =Page.init();
        d.setTotalRecord(65);
        return R.SUCCESS(d.getTotalPage() + "");
    }


}
