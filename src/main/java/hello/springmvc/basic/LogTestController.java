package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // lombok 제공
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        // 디폴트는 info 레벨, 아래 3개만 보인다. application.properties 로 로그레벨 설정 가능
        log.info("info log = {}", name);
        log.info("info log2 = " + name);    // 로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
