package Controller;

import Controller.Dto.ADto;
import Service.AService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller//컨트롤러 어노테이션
public class AController {//AController 생성

    @RequestMapping(value = "/aaa")//aaa경로로 가서
    public String main(){
        return "a1";//a1.jsp 페이지열어줌
    }
    @RequestMapping(value = "/bbb")//bbb경로로 가서
    public String main1(){ //위의 main 과 다른이름으로
        return "b1";//b1.jsp 페이지열어줌
    }
    @RequestMapping(value = "/ccc")//ccc경로로 가서
    public String main2(){ //위의 main1 과 다른이름으로
        return "c1";//c1.jsp 페이지열어줌
    }

    }

