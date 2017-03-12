/*
* @(#)DateUtils.java 1.0 2017年3月12日
*
* Copyright (c) 2013-2017 JiangXi Hangtian PoHuYun(JXHTPHY), Inc. 
* All Rights Reserved.
*
* This software is the confidential and proprietary information of JiangXi 
* Hangtian PoHuYun, Inc. ("Confidential Information"). You shall not
* disclose such Confidential Information and shall use it only in
* accordance with the terms of the license agreement you entered into
* with JXHTPHY.
*
* JXHTPHY MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
* THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
* TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
* PARTICULAR PURPOSE, OR NON-INFRINGEMENT. JXHTPHY SHALL NOT BE LIABLE FOR
* ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
* DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
*/
package com.jammy.timeUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @类名: DateUtils
 * @描述: 时间日期格式类
 * @版本: Version 1.0
 * @创建日期: 2017年3月12日下午4:31:55
 * @作者: Jammy
 * @JDK: 1.8
 */
/*
* 类的横向关系：TODO 说明与其它类的关联、调用或依赖等关系。
*/

public class DateUtils {
	private static SimpleDateFormat simpleDateFormat;
	
	//将日期转换为指定格式的字符串
	private static String DateToString(Date date, String datePattern){
		simpleDateFormat = new SimpleDateFormat(datePattern);
		return simpleDateFormat.format(date);
	}
	//将timestamp时间戳格式转换为指定格式的字符串
	public static String timeStampToString(long time,String datePattern){
		simpleDateFormat = new SimpleDateFormat(datePattern);
		Date date = new Date(time*1000);
		return simpleDateFormat.format(date);
	}
	public static void main(String[] args) {
		String datePattern = "yyyy-MM-dd HH:mm:ss";
		String datePattern2 = "yyyy-MM-dd";
		String datePattern3 = "yyyy-MM-dd HH:mm:ss.SSS";
		/*测试DateToString
		Date date = new Date();
		String dateTransfResult1 = DateUtils.DateToString(date, datePattern);
		String dateTransfResult2 = DateUtils.DateToString(date, datePattern2);
		String dateTransfResult3 = DateUtils.DateToString(date, datePattern3);
		System.out.println(date);
		System.out.println(dateTransfResult1);
		System.out.println(dateTransfResult2);
		System.out.println(dateTransfResult3);*/
		long timestamp = new Date().getTime()/1000;
		String timestampTransfResult1 = DateUtils.timeStampToString(timestamp, datePattern);
		System.out.println(timestampTransfResult1);
		String timestampTransfResult2 = DateUtils.timeStampToString(timestamp, datePattern2);
		System.out.println(timestampTransfResult2);
		String timestampTransfResult3 = DateUtils.timeStampToString(timestamp, datePattern3);
		System.out.println(timestampTransfResult3);
	}
}
