package org.pipi.sck.c2.controller;

import org.pipi.sck.c2.svc.C1Svc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class C2Controller {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private C1Svc c1Svc;
    @GetMapping("getC2Message")
    public String getC2Message() {
        String hostAddress = "";
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();// 获取本地IP对象
            hostAddress = inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String msg = c1Svc.getName(0);
        return """
                <html>
                    <body>
                        <p>这是C2的信息</p>
                    </body>
                </html>
                """ + msg + hostAddress + String.join("", discoveryClient.getServices());
    }
}
