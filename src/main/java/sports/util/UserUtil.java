package sports.util;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class UserUtil {

    public static String creadid(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","");
    }
    public static String md5(String msg) throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] input = msg.getBytes();
        byte[] output = messageDigest.digest(input);
        String result_MD5 = Base64.encodeBase64String(output);
        return  result_MD5;
    }
    public  static  void main (String [] args) throws NoSuchAlgorithmException {
        System.out.println(md5("567"));//测试
        System.out.println(md5("111111rrrr"));
    }
}
