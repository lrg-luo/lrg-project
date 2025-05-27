package org.example.springbootdemoproject.controller;

import org.example.springbootdemoproject.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * @Description:
 * @Author: pupu
 * @CreateDate: 2025/5/23 18:09
 * @UpdateUser:
 * @UpdateDate: 2025/5/23 18:09
 * @UpdateRemark:
 * @Version: 1.0
 */
@RestController
public class WebController {
    @Autowired
    WebService webService;

    @GetMapping(value = "/flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamFlux() {
        Flux<String> flux = Flux.fromStream(webService.getList().stream())
                .limitRate(3);
        return flux.delayElements(Duration.ofSeconds(1));
    }

    @GetMapping(value = "/base/{id}")
    public String streamFlux2(@PathVariable String id) {
        return id;
    }


}
