package com.entity.vo;

import com.entity.ShebeiJieyongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 设备借用
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shebei_jieyong")
public class ShebeiJieyongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 设备
     */

    @TableField(value = "shebei_id")
    private Integer shebeiId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 借用数量
     */

    @TableField(value = "shebei_jieyong_number")
    private Integer shebeiJieyongNumber;


    /**
     * 备注
     */

    @TableField(value = "beizhu_content")
    private String beizhuContent;


    /**
     * 是否归还
     */

    @TableField(value = "shebei_jieyong_types")
    private Integer shebeiJieyongTypes;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：设备
	 */
    public Integer getShebeiId() {
        return shebeiId;
    }


    /**
	 * 获取：设备
	 */

    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：借用数量
	 */
    public Integer getShebeiJieyongNumber() {
        return shebeiJieyongNumber;
    }


    /**
	 * 获取：借用数量
	 */

    public void setShebeiJieyongNumber(Integer shebeiJieyongNumber) {
        this.shebeiJieyongNumber = shebeiJieyongNumber;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 设置：是否归还
	 */
    public Integer getShebeiJieyongTypes() {
        return shebeiJieyongTypes;
    }


    /**
	 * 获取：是否归还
	 */

    public void setShebeiJieyongTypes(Integer shebeiJieyongTypes) {
        this.shebeiJieyongTypes = shebeiJieyongTypes;
    }
    /**
	 * 设置：归还时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：归还时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
