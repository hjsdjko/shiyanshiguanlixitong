package com.entity.view;

import com.entity.ShiyanshiYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 实验室预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueView extends ShiyanshiYuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否同意的值
		*/
		private String shiyanshiYuyueValue;



		//级联表 shiyanshi
			/**
			* 实验室名称
			*/
			private String shiyanshiName;
			/**
			* 实验室类型
			*/
			private Integer shiyanshiTypes;
				/**
				* 实验室类型的值
				*/
				private String shiyanshiValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 添加时间
			*/
			private Date insertTime;
			/**
			* 实验室详情
			*/
			private String shiyanshiContent;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;

	public ShiyanshiYuyueView() {

	}

	public ShiyanshiYuyueView(ShiyanshiYuyueEntity shiyanshiYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshiYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否同意的值
			*/
			public String getShiyanshiYuyueValue() {
				return shiyanshiYuyueValue;
			}
			/**
			* 设置： 是否同意的值
			*/
			public void setShiyanshiYuyueValue(String shiyanshiYuyueValue) {
				this.shiyanshiYuyueValue = shiyanshiYuyueValue;
			}

















				//级联表的get和set shiyanshi
					/**
					* 获取： 实验室名称
					*/
					public String getShiyanshiName() {
						return shiyanshiName;
					}
					/**
					* 设置： 实验室名称
					*/
					public void setShiyanshiName(String shiyanshiName) {
						this.shiyanshiName = shiyanshiName;
					}
					/**
					* 获取： 实验室类型
					*/
					public Integer getShiyanshiTypes() {
						return shiyanshiTypes;
					}
					/**
					* 设置： 实验室类型
					*/
					public void setShiyanshiTypes(Integer shiyanshiTypes) {
						this.shiyanshiTypes = shiyanshiTypes;
					}


						/**
						* 获取： 实验室类型的值
						*/
						public String getShiyanshiValue() {
							return shiyanshiValue;
						}
						/**
						* 设置： 实验室类型的值
						*/
						public void setShiyanshiValue(String shiyanshiValue) {
							this.shiyanshiValue = shiyanshiValue;
						}
					/**
					* 获取： 添加时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 添加时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}
					/**
					* 获取： 实验室详情
					*/
					public String getShiyanshiContent() {
						return shiyanshiContent;
					}
					/**
					* 设置： 实验室详情
					*/
					public void setShiyanshiContent(String shiyanshiContent) {
						this.shiyanshiContent = shiyanshiContent;
					}





				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}




}
