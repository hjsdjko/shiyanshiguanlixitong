package com.entity.view;

import com.entity.ShebeiJieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备借用
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shebei_jieyong")
public class ShebeiJieyongView extends ShebeiJieyongEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否归还的值
		*/
		private String shebeiJieyongValue;



		//级联表 shebei
			/**
			* 设备名称
			*/
			private String shebeiName;
			/**
			* 设备分类
			*/
			private Integer shebeiTypes;
				/**
				* 设备分类的值
				*/
				private String shebeiValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 添加时间
			*/
			private Date insertTime;
			/**
			* 设备详情
			*/
			private String shebeiContent;
			/**
			* 设备状态
			*/
			private Integer shebeiZhuangtaiTypes;
				/**
				* 设备状态的值
				*/
				private String shebeiZhuangtaiValue;

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

	public ShebeiJieyongView() {

	}

	public ShebeiJieyongView(ShebeiJieyongEntity shebeiJieyongEntity) {
		try {
			BeanUtils.copyProperties(this, shebeiJieyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否归还的值
			*/
			public String getShebeiJieyongValue() {
				return shebeiJieyongValue;
			}
			/**
			* 设置： 是否归还的值
			*/
			public void setShebeiJieyongValue(String shebeiJieyongValue) {
				this.shebeiJieyongValue = shebeiJieyongValue;
			}











				//级联表的get和set shebei
					/**
					* 获取： 设备名称
					*/
					public String getShebeiName() {
						return shebeiName;
					}
					/**
					* 设置： 设备名称
					*/
					public void setShebeiName(String shebeiName) {
						this.shebeiName = shebeiName;
					}
					/**
					* 获取： 设备分类
					*/
					public Integer getShebeiTypes() {
						return shebeiTypes;
					}
					/**
					* 设置： 设备分类
					*/
					public void setShebeiTypes(Integer shebeiTypes) {
						this.shebeiTypes = shebeiTypes;
					}


						/**
						* 获取： 设备分类的值
						*/
						public String getShebeiValue() {
							return shebeiValue;
						}
						/**
						* 设置： 设备分类的值
						*/
						public void setShebeiValue(String shebeiValue) {
							this.shebeiValue = shebeiValue;
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
					* 获取： 设备详情
					*/
					public String getShebeiContent() {
						return shebeiContent;
					}
					/**
					* 设置： 设备详情
					*/
					public void setShebeiContent(String shebeiContent) {
						this.shebeiContent = shebeiContent;
					}
					/**
					* 获取： 设备状态
					*/
					public Integer getShebeiZhuangtaiTypes() {
						return shebeiZhuangtaiTypes;
					}
					/**
					* 设置： 设备状态
					*/
					public void setShebeiZhuangtaiTypes(Integer shebeiZhuangtaiTypes) {
						this.shebeiZhuangtaiTypes = shebeiZhuangtaiTypes;
					}


						/**
						* 获取： 设备状态的值
						*/
						public String getShebeiZhuangtaiValue() {
							return shebeiZhuangtaiValue;
						}
						/**
						* 设置： 设备状态的值
						*/
						public void setShebeiZhuangtaiValue(String shebeiZhuangtaiValue) {
							this.shebeiZhuangtaiValue = shebeiZhuangtaiValue;
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
