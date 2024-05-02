package com.entity.model;

import com.entity.ShebeiJieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 设备借用
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShebeiJieyongModel implements Serializable {
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
     * 设备
     */
    private Integer shebeiId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 借用数量
     */
    private Integer shebeiJieyongNumber;


    /**
     * 备注
     */
    private String beizhuContent;


    /**
     * 是否归还
     */
    private Integer shebeiJieyongTypes;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


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
	 * 获取：设备
	 */
    public Integer getShebeiId() {
        return shebeiId;
    }


    /**
	 * 设置：设备
	 */
    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
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
	 * 获取：借用数量
	 */
    public Integer getShebeiJieyongNumber() {
        return shebeiJieyongNumber;
    }


    /**
	 * 设置：借用数量
	 */
    public void setShebeiJieyongNumber(Integer shebeiJieyongNumber) {
        this.shebeiJieyongNumber = shebeiJieyongNumber;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 获取：是否归还
	 */
    public Integer getShebeiJieyongTypes() {
        return shebeiJieyongTypes;
    }


    /**
	 * 设置：是否归还
	 */
    public void setShebeiJieyongTypes(Integer shebeiJieyongTypes) {
        this.shebeiJieyongTypes = shebeiJieyongTypes;
    }
    /**
	 * 获取：归还时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：归还时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
