package com.zhouyou.sb.core.util;

import java.util.Random;
import java.util.UUID;

public class ApplicationUtils {
    /**
     * 产生一个36个字符的UUID
     *
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 产生一个32个字符的UUID
     *
     * @return UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }







    /**
     * 获取多少位随机数
     * @param num
     * @return
     */
    public static String getNumStringRandom(int num){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        //随机生成数字，并添加到字符串
        for(int i = 0;i<num;i++){
            str.append(random.nextInt(10));
        }
        return  str.toString();
    }

    /**
     * 获取区间内的随机数
     * @param min
     * @param max
     * @return
     */
    public static int getRandomBetween(int min, int max){
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
    }
}
