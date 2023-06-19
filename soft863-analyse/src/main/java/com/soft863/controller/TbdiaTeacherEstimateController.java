package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbdiaTeach;
import com.soft863.domain.TbdiaTeacherEstimate;
import com.soft863.service.ITbdiaTeacherEstimateService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 优秀讲师评估Controller
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
@Controller
@RequestMapping("/dia/estimate")
public class TbdiaTeacherEstimateController extends BaseController
{
    private String prefix = "dia/estimate";

    @Autowired
    private ITbdiaTeacherEstimateService tbdiaTeacherEstimateService;

    @RequiresPermissions("dia:estimate:view")
    @GetMapping()
    public String estimate()
    {
        return prefix + "/estimate";
    }


    /**
     * 读取优秀讲师评估列表
     */
 /*   @RequiresPermissions("dia:estimate:list")
    @PostMapping("/list")
    @ResponseBody*/
    public TableDataInfo oldlist(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {

        if (tbdiaTeacherEstimate==null){
            List<TbdiaTeach> lists=tbdiaTeacherEstimateService.getTeacherData();

            //清空优秀教师评估表
            int i2=tbdiaTeacherEstimateService.deleteAll();

            List<TbdiaTeacherEstimate> tbdiaList=new ArrayList<>();
            for (TbdiaTeach list : lists) {
                TbdiaTeacherEstimate tbdiaTeachEstimate = new TbdiaTeacherEstimate();
                tbdiaTeachEstimate.setfTname(list.getfTname());
                tbdiaTeachEstimate.setfTno(list.getfTno());
                //tbdiaTeachEstimate.setfTeaQuality(list.getfT);
                tbdiaTeachEstimate.setfNationGainnum(list.getfNationGainnum());
                tbdiaTeachEstimate.setfCourseScore(list.getfCourseScore());
                tbdiaTeachEstimate.setfWorkday(list.getfWorkday());
                tbdiaTeachEstimate.setfComment(list.getfComment());

                if(list.getfNationGainnum()!=null&& list.getfSalary()!=null){
                    if(list.getfWorkday() >= 5 && list.getfCourseScore() >= 80){
                        tbdiaTeachEstimate.setfCommres("优秀讲师");
                        tbdiaTeachEstimate.setfComment("满足条件");
                    }else if(list.getfNationGainnum() >= 1){
                        tbdiaTeachEstimate.setfCommres("优秀讲师");
                        tbdiaTeachEstimate.setfComment("满足综合评定条件");
                    }else if(list.getfSalary()>7000){
                        tbdiaTeachEstimate.setfCommres("优秀讲师");
                    }else{
                        tbdiaTeachEstimate.setfCommres("普通讲师");
                    }
                }else {
                    tbdiaTeachEstimate.setfCommres("普通讲师");
                }

                int i = tbdiaTeacherEstimateService.insertTbdiaTeacherEstimate(tbdiaTeachEstimate);

            }

            startPage();
            List<TbdiaTeacherEstimate> list = tbdiaTeacherEstimateService.selectTbdiaTeacherEstimateList(null);
            return getDataTable(list);

        }else{
            startPage();
            List<TbdiaTeacherEstimate> list = tbdiaTeacherEstimateService.selectTbdiaTeacherEstimateList(tbdiaTeacherEstimate);
            return getDataTable(list);
        }


    }

    //获取数据，先展示到页面上
    @RequiresPermissions("dia:estimate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaTeacherEstimate tbdiaTeacherEstimate){

        System.out.println("1111");

        //获取原始数据
        startPage();
        List<TbdiaTeach> lists=tbdiaTeacherEstimateService.getTeacherData();

 /*       //将原始数据插入到
        for (TbdiaTeach list : lists) {
            TbdiaTeacherEstimate tbdiaTeachEstimate = new TbdiaTeacherEstimate();
            tbdiaTeachEstimate.setfTname(list.getfTname());
            tbdiaTeachEstimate.setfTno(list.getfTno());
            //tbdiaTeachEstimate.setfTeaQuality(list.getfT);
            tbdiaTeachEstimate.setfNationGainnum(list.getfNationGainnum());
            tbdiaTeachEstimate.setfCourseScore(list.getfCourseScore());
            tbdiaTeachEstimate.setfWorkday(list.getfWorkday());
            tbdiaTeachEstimate.setfComment(list.getfComment());

            int i = tbdiaTeacherEstimateService.insertTbdiaTeacherEstimate(tbdiaTeachEstimate);

        }*/
        return getDataTable(lists);
    }

    //进行条件评估
    @GetMapping("/assess")
    public void assess(){

    }


    /**
     * 导出优秀讲师评估列表
     */
    @RequiresPermissions("dia:estimate:export")
    @Log(title = "优秀讲师评估", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {
        List<TbdiaTeacherEstimate> list = tbdiaTeacherEstimateService.selectTbdiaTeacherEstimateList(tbdiaTeacherEstimate);
        ExcelUtil<TbdiaTeacherEstimate> util = new ExcelUtil<TbdiaTeacherEstimate>(TbdiaTeacherEstimate.class);
        return util.exportExcel(list, "优秀讲师评估数据");
    }

    //跳转设置评估条件设置页面
    @GetMapping("/toCondition")
     public String condition(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {
        return prefix+"/condition";
    }





    /**
     * 修改优秀讲师评估
     */
    @RequiresPermissions("dia:estimate:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaTeacherEstimate tbdiaTeacherEstimate = tbdiaTeacherEstimateService.selectTbdiaTeacherEstimateByFId(fId);
        mmap.put("tbdiaTeacherEstimate", tbdiaTeacherEstimate);
        return prefix + "/edit";
    }

    /**
     * 修改保存优秀讲师评估
     */
    @RequiresPermissions("dia:estimate:edit")
    @Log(title = "优秀讲师评估", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {
        return toAjax(tbdiaTeacherEstimateService.updateTbdiaTeacherEstimate(tbdiaTeacherEstimate));
    }

    /**
     * 删除优秀讲师评估
     */
    @RequiresPermissions("dia:estimate:remove")
    @Log(title = "优秀讲师评估", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaTeacherEstimateService.deleteTbdiaTeacherEstimateByFIds(ids));
    }
    //select

}
