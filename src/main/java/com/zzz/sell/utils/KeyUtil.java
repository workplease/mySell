package com.zzz.sell.utils;

import java.util.Random;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-12 17:16
 * @Version: 1.0
 *
 * 索引生成工具类
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
