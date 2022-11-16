package cn.sx.ebj.biding.controller;

import cn.sx.ebj.bidding.common.core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/**
 * @name: indexController
 * @author: chunjie
 * @date: 2022-11-16 22:39
 **/
@Controller
public class IndexController extends BaseController {

    public String index(ModelMap map) {

        return "index";
    }
}
