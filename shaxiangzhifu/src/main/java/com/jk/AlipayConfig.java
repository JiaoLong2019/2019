package com.jk;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101700705103";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCXv4Px0lnc03fIOZS6NVOsN31lEz4jPjmenb60JAT0ksaqR9hUaZW2A6RhpVTYoYvv18d13m+UJ8vmQZRtDyvgpNxNZTJgRZC6eqQYJmK4gND1tu7eP1kp6xmy42ttIKfmgxeKVAP3uocKqpffP6OYldAoHoKcjsHqwcEj5w1j66zmuOnjQHNIeAXxWSgHJfdq1pM/MNL5k/wFKn8f+0FaU1GsHSKM05Im3pnhJ+sZJ6aR9Wrw6gXTkXj5dd/cu+undpdkRLrxzenyPvYGR/T9eaGbUWia+qPPC9cGhdM2m/r90NSgOD5hbEdEbJP4SlIfElgX8hQPa3Ub11ES6Q15AgMBAAECggEBAIczrISNjWExzHxJyVhq4OUE/6VJkshlzYKkO2BW409hYr4eiwESnb/w2MnjO4hTztFf6Kf9Cl7vYj0B2xOcO9TILjyK2GpsMLnlQUT/FmAa7ZKvbX345SFzBY+cDn/JY67+x7+IgYx71YvMWMog8kql2DOWk3qXuvDFtqadWxHVZVHlJ5//35Hv1Ejifrk4Wv/BEpcJQD7OIeHU+vJ/aMBhqtBe0f8yJ+sAegWhE45frbn30Yw+XmBnQ4eAmyxY4Rhnh+86tegADXsUeRDPDFoOj/HHZ3Z7K3s107L5RM9m6ZtbZYtO9Oe76bMuJeSRPFhNrCrG1tC4gSxhCXGqWW0CgYEA+XU5WnFsVY78RJdHN85sQYdbDdsTfqCjqBn92sxt4tQ5PEnWNUAcHT+WGjLBiFMUiRMorB/v5d/4A/28kDL7olF/jJX/vzrUcksBQW/4MiYkpnxZSBeDsekVQkjlBcIwPd4E84G1BdVJKqDW4VVqUhCejVPrHzT9WRNN9fSxdLcCgYEAm7pNBD1zyZwBph9iNgmU1W7GF06JOozhrnLsk3VHUjj7N7d5IRYSIYX5K5Yz8cJfk2yQN/3yUFLn01QnQZFmnRzqIQ+pc6xSKswJw8S+mSoDwRFayw+VAx4vcMp2AAzhKWjH4aIpBwUhN0pV46haz9YUaBH4WZd/uu+nszP7P08CgYEA3DDUxziG356unfzKKEBU3iKUBM7zjjpNOvx2TsNT23xoaQbjxW0pY8fUvps+qQ5sefInXId0QfxH933pC391DfnSFE3yyOEs1RXPresfsWRpxWrNhAz9efS7hx7AySx3WKS4yhgbqWJyiuYdxhiXGIkC6szAJXOojQ+1KP0sBlECgYEAl1nO5pMPSN/d3mXcHubbB0DdN+O1jflEkjbR5VLzmV8WEgW4rUZ1Iq3CCPG31Hz0RSUbWb/vVM/uzj6Y1KoLUCG9D5rYNztAtKWPy/wYvmXONkO2uWqQifI5a2bqnovl/kf/FDV1qIP8z27o4RVMBXlsZeUpOXH7y2SG2a1owBMCgYB/kfMEJjmfedJDsz3EiqbF8n/UpE2pLJMEMA8ZmRtd+CWngYIaRHxUTjKxFTEPUe+HjvB7qUmdcB8BAtuKDODtMMfpgSCZ0xb2js1TNaQ8GJSTShlXShG66g7y/MGYSDaeOP9WwqKkF2NP1qb31Xq8yrmt8dT0QkKvBUKpRsLXUQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqOjK+UDSOjBIU7UeGKIuUCHbc/0rg2XiumUNNfcbl2CETYd3jE2kKr3NOQyDq+IbPP88Xq67WgKjmkXx0CAkyyCK+S9IfZU5ncFe2B6CJmvTY3CTSAGjxUkwFJxM59da6dnVLEFmjWhLf7aLivpvVcRCw0DSNaMtBgbEQ4zm2PKczn2RRQN/ZtNCxTuiesxffJUp9v8rVQBrJ+a0WLEsvxd6PyhpSMXITBMqJber7GFVMw8U3LRWMSskZDFGIdzD351I7GntxCJwRA2JdhnDI/2pz3vhoIeUscbd0Z1HY5rlXZYayGqN7pp5+WINrBTEvlnqmW8LN5J3tVOn5ToXVQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
