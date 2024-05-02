package com.entity.vo;

import com.entity.ShiyanshiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueVO implements Serializable {
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
     * 实验室
     */

    @TableField(value = "shiyanshi_id")
    private Integer shiyanshiId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuyue_time")
    private Date yuyueTime;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
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

}
