/**
 * Create By Jammy
 */
package com.jammy.uuidUtils;

import java.util.UUID;

/**
 * @类名: UUIDUtils
 * @描述: UUID工具类
 * @版本: Version 1.0
 * @创建日期: 2017年3月12日下午3:51:58
 * @作者: Jammy
 * @JDK: 1.8
 */
public class UUIDUtils {
	//产生原生态的UUID
	private static String uuidCreate(){
		return UUID.randomUUID().toString();
	}
	//产生没有横杠的UUID
	private static String uuidCreateNoDash(){
		return UUID.randomUUID().toString().replace("-", ""); 
	}
	public static void main(String[] args) {
		String str = UUIDUtils.uuidCreateNoDash();
		String strOrigin  = UUIDUtils.uuidCreate();
		System.out.println(str);
		System.out.println(strOrigin);
	}
}
