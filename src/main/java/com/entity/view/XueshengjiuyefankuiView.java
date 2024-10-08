package com.entity.view;

import com.entity.XueshengjiuyefankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生就业反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
@TableName("xueshengjiuyefankui")
public class XueshengjiuyefankuiView  extends XueshengjiuyefankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengjiuyefankuiView(){
	}
 
 	public XueshengjiuyefankuiView(XueshengjiuyefankuiEntity xueshengjiuyefankuiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengjiuyefankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
