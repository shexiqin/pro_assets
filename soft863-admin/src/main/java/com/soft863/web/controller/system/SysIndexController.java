package com.soft863.web.controller.system;

import com.soft863.common.config.RuoYiConfig;
import com.soft863.common.constant.ShiroConstants;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.domain.entity.SysMenu;
import com.soft863.common.core.domain.entity.SysUser;
import com.soft863.common.core.text.Convert;
import com.soft863.common.utils.CookieUtils;
import com.soft863.common.utils.DateUtils;
import com.soft863.common.utils.ServletUtils;
import com.soft863.common.utils.StringUtils;
import com.soft863.domain.TbquaDetail;
import com.soft863.framework.shiro.service.SysPasswordService;
import com.soft863.scheduledtask.TaskServiceImpl;
import com.soft863.service.impl.QuaDataDetectionServiceImpl;
import com.soft863.service.impl.TbquaDetailServiceImpl;
import com.soft863.system.service.ISysConfigService;
import com.soft863.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 首页 业务处理
 * 
 * @author ruoyi
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    @Autowired
    private ISysConfigService configService;

    @Autowired
    private SysPasswordService passwordService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("sideTheme", configService.selectConfigByKey("sys.index.sideTheme"));
        mmap.put("skinName", configService.selectConfigByKey("sys.index.skinName"));
        Boolean footer = Convert.toBool(configService.selectConfigByKey("sys.index.footer"), true);
        Boolean tagsView = Convert.toBool(configService.selectConfigByKey("sys.index.tagsView"), true);
        mmap.put("footer", footer);
        mmap.put("tagsView", tagsView);
        mmap.put("mainClass", contentMainClass(footer, tagsView));
        mmap.put("copyrightYear", RuoYiConfig.getCopyrightYear());
        mmap.put("demoEnabled", RuoYiConfig.isDemoEnabled());
        mmap.put("isDefaultModifyPwd", initPasswordIsModify(user.getPwdUpdateDate()));
        mmap.put("isPasswordExpired", passwordIsExpiration(user.getPwdUpdateDate()));
        mmap.put("isMobile", ServletUtils.checkAgentIsMobile(ServletUtils.getRequest().getHeader("User-Agent")));

        // 菜单导航显示风格
        String menuStyle = configService.selectConfigByKey("sys.index.menuStyle");
        // 移动端，默认使左侧导航菜单，否则取默认配置
        String indexStyle = ServletUtils.checkAgentIsMobile(ServletUtils.getRequest().getHeader("User-Agent")) ? "index" : menuStyle;

        // 优先Cookie配置导航菜单
        Cookie[] cookies = ServletUtils.getRequest().getCookies();
        for (Cookie cookie : cookies)
        {
            if (StringUtils.isNotEmpty(cookie.getName()) && "nav-style".equalsIgnoreCase(cookie.getName()))
            {
                indexStyle = cookie.getValue();
                break;
            }
        }
        String webIndex = "topnav".equalsIgnoreCase(indexStyle) ? "index-topnav" : "index";
        return webIndex;
    }

    // 锁定屏幕
    @GetMapping("/lockscreen")
    public String lockscreen(ModelMap mmap)
    {
        mmap.put("user", getSysUser());
        ServletUtils.getSession().setAttribute(ShiroConstants.LOCK_SCREEN, true);
        return "lock";
    }

    // 解锁屏幕
    @PostMapping("/unlockscreen")
    @ResponseBody
    public AjaxResult unlockscreen(String password)
    {
        SysUser user = getSysUser();
        if (StringUtils.isNull(user))
        {
            return AjaxResult.error("服务器超时，请重新登录");
        }
        if (passwordService.matches(user, password))
        {
            ServletUtils.getSession().removeAttribute(ShiroConstants.LOCK_SCREEN);
            return AjaxResult.success();
        }
        return AjaxResult.error("密码不正确，请重新输入。");
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin()
    {
        return "skin";
    }

    // 切换菜单
    @GetMapping("/system/menuStyle/{style}")
    public void menuStyle(@PathVariable String style, HttpServletResponse response)
    {
        CookieUtils.setCookie(response, "nav-style", style);
    }

    @Autowired
    QuaDataDetectionServiceImpl quaDataDetectionService;
    @Autowired
    TbquaDetailServiceImpl tbquaDetailService;

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        TbquaDetail stuLose=new TbquaDetail();
        stuLose.setfTbname(Long.parseLong("1012"));
        stuLose.setfType("1");
        TbquaDetail stuMore=new TbquaDetail();
        stuMore.setfTbname(Long.parseLong("1012"));
        stuMore.setfType("0");
        TbquaDetail teaLose=new TbquaDetail();
        teaLose.setfTbname(Long.parseLong("1013"));
        teaLose.setfType("1");
        TbquaDetail teaMore=new TbquaDetail();
        teaMore.setfTbname(Long.parseLong("1013"));
        teaMore.setfType("0");
        List<Integer> lose=new ArrayList<>();
        List<Integer> more=new ArrayList<>();
        int stuLoseCount = quaDataDetectionService.count(stuLose);
        int stuMoreCount =quaDataDetectionService.count(stuMore);
        int teaLoseCount = quaDataDetectionService.count(teaLose);
        int teaMoreCount =quaDataDetectionService.count(teaMore);
        lose.add(stuLoseCount);
        lose.add(teaLoseCount);
        more.add(stuMoreCount);
        more.add(teaMoreCount);
        List<Integer> loseList = TaskServiceImpl.getLose();
        List<Integer> moreList = TaskServiceImpl.getMore();
        List<String> date = TaskServiceImpl.getDate();
        mmap.put("lose",lose);
        mmap.put("more",more);
        mmap.put("loseList",loseList);
        mmap.put("moreList",moreList);
        mmap.put("date",date);
        mmap.put("version", RuoYiConfig.getVersion());
        return "main_v1";
    }

    // content-main class
    public String contentMainClass(Boolean footer, Boolean tagsView)
    {
        if (!footer && !tagsView)
        {
            return "tagsview-footer-hide";
        }
        else if (!footer)
        {
            return "footer-hide";
        }
        else if (!tagsView)
        {
            return "tagsview-hide";
        }
        return StringUtils.EMPTY;
    }

    // 检查初始密码是否提醒修改
    public boolean initPasswordIsModify(Date pwdUpdateDate)
    {
        Integer initPasswordModify = Convert.toInt(configService.selectConfigByKey("sys.account.initPasswordModify"));
        return initPasswordModify != null && initPasswordModify == 1 && pwdUpdateDate == null;
    }

    // 检查密码是否过期
    public boolean passwordIsExpiration(Date pwdUpdateDate)
    {
        Integer passwordValidateDays = Convert.toInt(configService.selectConfigByKey("sys.account.passwordValidateDays"));
        if (passwordValidateDays != null && passwordValidateDays > 0)
        {
            if (StringUtils.isNull(pwdUpdateDate))
            {
                // 如果从未修改过初始密码，直接提醒过期
                return true;
            }
            Date nowDate = DateUtils.getNowDate();
            return DateUtils.differentDaysByMillisecond(nowDate, pwdUpdateDate) > passwordValidateDays;
        }
        return false;
    }
}
