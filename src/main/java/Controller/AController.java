package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AController {

    @RequestMapping(value = "/aaa")
    public String main(){
        return "a1";
    }
    @RequestMapping(value = "/bbb")
    public String main1(){
        return "b1";
    }
    @RequestMapping(value = "/ccc")
    public String main2(){
        return "c1";
    }
    @RequestMapping(value = "/complete")
    public String main3(){
        return "end";
    }
}
