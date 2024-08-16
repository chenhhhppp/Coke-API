package com.chp.cokeapiinterface.controller;

import com.chp.cokeapiclientsdk.model.User;
import com.chp.cokeapiclientsdk.utils.SignUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

/**
 * 名称 API
 *
 * @author chp
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        // 从请求头中获取参数
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        // todo 实际情况是去数据库中查是否已分配给用户
        if (!accessKey.equals("abc")) {
            throw new RuntimeException("无权限");
        }
        //校验随机数，模拟直接判断nonce是否大于10000
        if (Long.parseLong(nonce) > 10000) {
            throw new RuntimeException("无权限");
        }
        // todo 时间和当前时间不能超过5分钟
//        if (timestamp){
//
//        }

        // todo 实际情况是从数据库汇总查出 secretKey
        String serverSign = SignUtils.genSign(body, "def");
        // 如果生成的签名不一致，则抛出异常，并提示“无权限”
        if (!sign.equals(serverSign)) {
            throw new RuntimeException("无权限");
        }

        // 如果权限校验通过，返回 ”POST 用户名字是“+用户名
        String result = "POST 用户名字是" + user.getUseranme();
        return result;
    }


}
