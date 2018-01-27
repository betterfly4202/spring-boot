package com.betterfly.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by betterFLY on 2018. 1. 27.
 * Github : http://github.com/betterfly88
 */

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping(value = "/") //@RequestMapping(value="/", method = RequestMethod.GET)
    public String main(){
        return "posts/main";
        /*
            handlebars-spring-boot-starter 덕분에 컨트롤러에서 문자열을 반환할때 앞의 path와 뒤의 파일 확장자는 자동으로 지정됩니다.
            (prefix: src/main/resources/templates, suffix: .hbs)
            즉 여기선 "main"을 반환하니, src/main/resources/templates/main.hbs로 전환되어 View Resolver가 처리하게 됩니다.
            (ViewResolver는 URL 요청의 결과를 전달할 타입과 값을 지정하는 관리자 격으로 보시면 됩니다.)
         */
    }
}
