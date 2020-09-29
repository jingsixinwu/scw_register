package com.offcn.user.component;

import com.offcn.util.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
@Slf4j
public class SmsTemplate {
    @Value("${sms.host}")
    private String host;
    @Value("${sms.path}")
    private String path;
    @Value("${sms.method}")
    private String method;
    @Value("${sms.appcode}")
    private String appcode;

    public String sendCode(Map<String,String> querys){

        HttpResponse response = null;
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);

        Map<String, String> bodys = new HashMap<String, String>();
        try {
            if (method.equalsIgnoreCase("get")) {
                response = HttpUtils.doGet(host, path, method, headers, querys);
            } else {
                response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            }
            String string = EntityUtils.toString(response.getEntity());
            log.info("短信发送完成；响应数据是：{}", string);
            return string;
        } catch (Exception e) {
            log.error("短信发送失败；发送参数是：{}", querys);
            return "fail";
        }

    }



}
