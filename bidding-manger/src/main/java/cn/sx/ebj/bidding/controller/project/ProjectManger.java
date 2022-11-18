package cn.sx.ebj.bidding.controller.project;

import cn.sx.ebj.bidding.common.core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name: 项目管理模块
 * @author: chunjie
 * @date: 2022-11-16 22:49
 **/
@Controller
@RequestMapping("/project")
public class ProjectManger extends BaseController {
    @RequestMapping("/list")
    public String projectList(ModelMap map) {

        return "project/list";
    }
}
