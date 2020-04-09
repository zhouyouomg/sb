package com.zhouyou.sb.core;

import com.zhouyou.sb.entity.UserInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class test {

        public static void main(String []ages ) throws IllegalAccessException, InstantiationException {
        //加密方式
        String hashAlgorithmName = "md5";
        //原密码
        String credentials = "123456";
        //加密次数
        int hashIterations = 64;
        //加密盐值，大家可以用生成字符串的方法
        String hash = "wxKYXuTPST5SG0jMQzVPsg==";
        ByteSource credentialsSalt = ByteSource.Util.bytes(hash);
        String password = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toHex();
        System.out.println(password);
    }
}
