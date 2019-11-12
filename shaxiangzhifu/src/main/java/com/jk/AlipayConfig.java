package com.jk;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101700705103";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCWvT9Y6pDiX5fwdS5s8wOD7L++34ktwNnXxfNE1zQ3RFg94iLzdDYDYnVrGsKCBHeOLFqTOxDFx2KmUY902GvHq9AMeJDsbz6MseFM+CvpUGpw0/46vV68Bj2g5bGhceoN6KUL0qtYUEbocZSJUFtEtjsk5AGn7sb4CkLJ1FFLsm8sD1fUbNy6TNWK7ZVcb33V9w6HWO2p5xAtCIOlrxJ1t6oR/VvMIOtF0A71MNjydfijy4QLUoS/SJFiIgevdL4GMJrUKs9WqLQCKImBvHidB6suAX6gvj7OQ64qWpzurG5DvZZGZc3fzJgaAzW+PjhHperExaB2Nf49jAUrdFrbAgMBAAECggEAU8zt9K6i0Va3j1R19Ne88pChoKmBB9CYyt4fefvx6W+zZuPa7mGCzarlACAmVkXJeV6rFALYNju8Wh4plJnkgWLBDM3SM788lNcnG7U0JEcyhXs1cM5qZjlJ9bL8Z3Z+2jCl4MbDvxsR8JOEMjpcIvz0MHQZf5S9RJPfwXipoVy89X4cL/KlCASfr+rF8YarcGeOgj8Fg81jsgI1NjJKOwFo98tXj5D7f0Hd8Mz9xP1BXNsOhn8kNWElO/Sv/5q3DNMECzBhK5yBTwxY5ChBPMlGjLbEtsg3EwEwMN1RG3cKxNY7yCMpP6LWgRr4bfw0Ry7ppsMCMDzz0WMU3+TswQKBgQDJ2LCG8TqVWV2SYyBtJ+SzzzseKB3cLm6f5L8FAZ6RG47KtWstN2PTXRsGsT+Xs73lqcXyTVWDYPnnKQpbPeLUKhNPh7jfNHm7hfmqWPj7adynXVyqrb224ESRtesS7SgFQ3EMvdUd5nnL8K6aQSD6M57gvoY9MmQzNMhA9IjHiwKBgQC/LmPSLhBczfVu/xZRI5N7J4bBt9Kr8epMSIbTnYiOL/Yrj7/JsIRpM+wYyWxo38HL05WZ011uRiQYPBYWAZsypH4yOhpqI9uovRE8Gdh1yWcqY9oQYSQ2SdDTrMp5mc5z6DD9SKkSxgtLu7VO2iAUTbS2QgYLrdcFNeHIC0mj8QKBgHZvFLU5GfzD4OmiDEbAH6t5ruB0/YBSJkrfd03Cs33FQ7WhWW/AjmxYtyDoI74pkwUM5r7TrZdW8Ys3Q4Jh/5Qp1AbYRhuBuOPVKrdPWVh7tyLk3xiutSB22wT8TyBd0xuzhMPLJx9SOqj1Yh3UlTr5ywFoCXAi/zQkhlPGp/MdAoGAXl6py3ANh6HqytWD0J19CUejjzAL//A0NV9/nime5IDsROh6RTaqxbtpiXqz1rjM0q4opHvfHLXmz0epp0c3srHb0TM5Ird8kDhzr3UaklnOYPBVDczFsT6SpEog0BGKBVDSDdS2EJxNqx6HCttFBoCs+WJx1YYEI4BLaRGZUiECgYASvqE2pH1RrsCvYVlJqWtJ9MOFfYl4rmO4S8zeStxMLz1CbqmzZBKUB0oHuP1Vgw2ertI5hfPdIGZOkFAjU632AEKYl6XxF7FhXqJY0TJfXgKvgAIbOGZWsXdGj5SZ8JMZ3AOBjrJ7JF6oLgmjMGfG319AoJBW/PkpsEpu66kULw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlr0/WOqQ4l+X8HUubPMDg+y/vt+JLcDZ18XzRNc0N0RYPeIi83Q2A2J1axrCggR3jixakzsQxcdiplGPdNhrx6vQDHiQ7G8+jLHhTPgr6VBqcNP+Or1evAY9oOWxoXHqDeilC9KrWFBG6HGUiVBbRLY7JOQBp+7G+ApCydRRS7JvLA9X1GzcukzViu2VXG991fcOh1jtqecQLQiDpa8SdbeqEf1bzCDrRdAO9TDY8nX4o8uEC1KEv0iRYiIHr3S+BjCa1CrPVqi0AiiJgbx4nQerLgF+oL4+zkOuKlqc7qxuQ72WRmXN38yYGgM1vj44R6XqxMWgdjX+PYwFK3Ra2wIDAQAB";

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
