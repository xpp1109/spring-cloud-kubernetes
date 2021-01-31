package org.pipi.sck.c1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class C1Controller {
    /**
     * 获取C1消息
     *
     * @return
     */
    @GetMapping("getC1Message")
    public String getC1Message() {
        String hostAddress = "";
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();// 获取本地IP对象
            hostAddress = inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return """
                <html>
                    <body>
                        <p>这是C1的信息</p>
                    </body>
                </html>
                """ + hostAddress;
    }
}
