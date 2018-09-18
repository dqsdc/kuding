package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.mapper.CourseMapper;
import com.qilinxx.kuding.domain.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: ljm
 * @Date: 2018-09-13 15:57
 * @Description: 主控制类，动态映射HTML路径
 */
@Controller
public class IndexController {

    @Autowired
    CourseMapper courseMapper;

    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/welcome")
    public String showWelcome() {
        return "welcome";
    }

    @RequestMapping("picture-add.html")
    public String showPictureAdd() {
        return "picture-add";
    }

    @RequestMapping("picture-list.html")
    public String showPictureList() {
        return "picture-list";
    }

    @RequestMapping("feedback-list.html")
    public String showFeedbackList() {
        return "feedback-list";
    }

    @RequestMapping("product-add.html")
    public String showProductAdd() {
        return "product-add";
    }

    @RequestMapping("product-brand.html")
    public String showProductBrand() {
        return "product-brand";
    }

    @RequestMapping("product-category.html")
    public String showProductCategory() {
        return "product-category";
    }

    @RequestMapping("product-category-add.html")
    public String showProductCategoryAdd() {
        return "product-category-add";
    }

    @RequestMapping("product-list.html")
    public String showProductList() {
        return "product-list";
    }

    @RequestMapping("member-add.html")
    public String showMemberAdd() {
        return "member-add";
    }

    @RequestMapping("member-list.html")
    public String showMemberList() {
        return "member-list";
    }

    @RequestMapping("member-del.html")
    public String showMemberDel() {
        return "member-del";
    }

    @RequestMapping("member-record-browse.html")
    public String showMemberRecordBrowse() {
        return "member-record-browse";
    }

    @RequestMapping("member-record-download.html")
    public String showMemberRecordDownload() {
        return "member-record-download";
    }

    @RequestMapping("member-record-share.html")
    public String showMemberRecordShare() {
        return "member-record-share";
    }

    @RequestMapping("user-add.html")
    public String showUserAdd() {
        return "user-add";
    }

    @RequestMapping("user-list.html")
    public String showUserList() {
        return "user-list";
    }

    @RequestMapping("user-password-edit.html")
    public String showUserPasswordEdit() {
        return "user-password-edit";
    }

    @RequestMapping("user-show.html")
    public String showUserShow() {
        return "user-show";
    }

    @RequestMapping("system-base.html")
    public String showSystemBase() {
        return "system-base";
    }

    @RequestMapping("system-category.html")
    public String showSystemCategory() {
        return "system-category";
    }

    @RequestMapping("system-category-add.html")
    public String showSystemCategoryAdd() {
        return "system-category-add";
    }

    @RequestMapping("system-data.html")
    public String showSystemData() {
        return "system-data";
    }

    @RequestMapping("system-shielding.html")
    public String showSystemShielding() {
        return "system-shielding";
    }

    @RequestMapping("system-log.html")
    public String showSystemLog() {
        return "system-log";
    }

    @RequestMapping("admin-role.html")
    public String showAdminRole() {
        return "admin-role";
    }

    @RequestMapping("admin-permission.html")
    public String showAdminPermission() {
        return "admin-permission";
    }

    @RequestMapping("admin-list.html")
    public String showAdminList() {
        return "admin-list";
    }

}