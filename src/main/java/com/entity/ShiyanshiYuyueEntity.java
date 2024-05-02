package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 实验室预约
 *
 * @author 
 * @email
 */
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiYuyueEntity() {

	}

	public ShiyanshiYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 实验室
     */
    @TableField(value = "shiyanshi_id")

    private Integer shiyanshiId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuyue_time",fill = FieldFill.UPDATE)

    private Date yuyueTime;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 人数
     */
    @TableField(value = "shiyanshi_yuyue_number")

    private Integer shiyanshiYuyueNumber;


    /**
     * 申请详情
     */
    @TableField(value = "shenqing_content")

    private String shenqingContent;


    /**
     * 是否同意
     */
    @TableField(value = "shiyanshi_yuyue_types")

    private Integer shiyanshiYuyueTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 获取：实验室
	 */

    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
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
	 * 设置：人数
	 */
    public Integer getShiyanshiYuyueNumber() {
        return shiyanshiYuyueNumber;
    }


    /**
	 * 获取：人数
	 */

    public void setShiyanshiYuyueNumber(Integer shiyanshiYuyueNumber) {
        this.shiyanshiYuyueNumber = shiyanshiYuyueNumber;
    }
    /**
	 * 设置：申请详情
	 */
    public String getShenqingContent() {
        return shenqingContent;
    }


    /**
	 * 获取：申请详情
	 */

    public void setShenqingContent(String shenqingContent) {
        this.shenqingContent = shenqingContent;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getShiyanshiYuyueTypes() {
        return shiyanshiYuyueTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setShiyanshiYuyueTypes(Integer shiyanshiYuyueTypes) {
        this.shiyanshiYuyueTypes = shiyanshiYuyueTypes;
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

    @Override
    public String toString() {
        return "ShiyanshiYuyue{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", shiyanshiId=" + shiyanshiId +
            ", yuyueTime=" + yuyueTime +
            ", insertTime=" + insertTime +
            ", shiyanshiYuyueNumber=" + shiyanshiYuyueNumber +
            ", shenqingContent=" + shenqingContent +
            ", shiyanshiYuyueTypes=" + shiyanshiYuyueTypes +
            ", createTime=" + createTime +
        "}";
    }
}
