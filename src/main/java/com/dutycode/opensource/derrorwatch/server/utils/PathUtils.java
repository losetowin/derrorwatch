package com.dutycode.opensource.derrorwatch.server.utils;

import org.apache.commons.lang3.StringUtils;

public class PathUtils {

	/**
	 * 获取基础路径，获取规则：
	 * 1、如果jvm参数中传递，则使用jvm参数的配置（jvm参数为：basepath）
	 * 2、如果未传递，则默认使用当前jar包所在目录
	 * @return
	 */
	public static  String getBasePath(){
		String basePath = System.getProperty("basepath");
		if (StringUtils.isNotBlank(basePath)){
			return basePath;
		}else {
			String f = PathUtils.class.getProtectionDomain().getCodeSource().getLocation().getFile();
			return f;
		}
			
	}
	
	
	public static void main(String[] args) {
		System.out.println(getBasePath());
	}
}
