package cn.sx.ebj.bidding.controller;

import cn.sx.ebj.bidding.common.core.BaseController;
import cn.sx.ebj.bidding.common.data.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController extends BaseController {

    @GetMapping(value = {"","/"})
    public String index(ModelMap map){

        log.info("首页->{}","访问首页");
        return "index";
    }

    @GetMapping("test")
    @ResponseBody
    public R<String> getIndex(){

        return R.SUCCESS("1111");
    }


}
