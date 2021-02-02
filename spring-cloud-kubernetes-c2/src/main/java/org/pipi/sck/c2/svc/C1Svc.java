package org.pipi.sck.c2.svc;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class C1Svc {
    private final RestTemplate restTemplate;

    public C1Svc(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName(int delay) {
        return restTemplate.getForObject("http://c1/getC1Message", String.class);
    }
}
