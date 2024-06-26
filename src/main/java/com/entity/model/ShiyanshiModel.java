package com.entity.model;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室名称
     */
    private String shiyanshiName;


    /**
     * 实验室类型
     */
    private Integer shiyanshiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 实验室详情
     */
    private String shiyanshiContent;


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
	 * 获取：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }


    /**
	 * 设置：实验室名称
	 */
    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 获取：实验室类型
	 */
    public Integer getShiyanshiTypes() {
        return shiyanshiTypes;
    }


    /**
	 * 设置：实验室类型
	 */
    public void setShiyanshiTypes(Integer shiyanshiTypes) {
        this.shiyanshiTypes = shiyanshiTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：实验室详情
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 设置：实验室详情
	 */
    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
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
