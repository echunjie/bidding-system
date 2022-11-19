package cn.sx.ebj.bidding.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @name: 字符工具类
 * @author: chunjie
 * @date: 2022-11-19 13:08
 **/

public class StrUtils {

    private static Logger log = LoggerFactory.getLogger(StrUtils.class);


    /**
     * 判断字符串是否为为NULL or 空字符串
     *
     * @param obj String
     * @return boolean
     */
    public static boolean isEmpty(String obj) {
        return (obj == null || obj.equals(""));
    }

    /**
     * 字符串对象不为NULL or 空字符串
     *
     * @param obj String
     * @return boolean
     */
    public static boolean isNotEmpty(String obj) {
        return (obj != null && !obj.equals(""));
    }


}
