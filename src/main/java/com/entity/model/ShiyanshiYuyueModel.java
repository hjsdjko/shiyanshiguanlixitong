package com.entity.model;

import com.entity.ShiyanshiYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 实验室
     */
    private Integer shiyanshiId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuyueTime;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 人数
     */
    private Integer shiyanshiYuyueNumber;


    /**
     * 申请详情
     */
    private String shenqingContent;


    /**
     * 是否同意
     */
    private Integer shiyanshiYuyueTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 设置：实验室
	 */
    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：人数
	 */
    public Integer getShiyanshiYuyueNumber() {
        return shiyanshiYuyueNumber;
    }


    /**
	 * 设置：人数
	 */
    public void setShiyanshiYuyueNumber(Integer shiyanshiYuyueNumber) {
        this.shiyanshiYuyueNumber = shiyanshiYuyueNumber;
    }
    /**
	 * 获取：申请详情
	 */
    public String getShenqingContent() {
        return shenqingContent;
    }


    /**
	 * 设置：申请详情
	 */
    public void setShenqingContent(String shenqingContent) {
        this.shenqingContent = shenqingContent;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getShiyanshiYuyueTypes() {
        return shiyanshiYuyueTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setShiyanshiYuyueTypes(Integer shiyanshiYuyueTypes) {
        this.shiyanshiYuyueTypes = shiyanshiYuyueTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
