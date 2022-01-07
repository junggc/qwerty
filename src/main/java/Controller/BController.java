package Controller;

import org.springframework.stereotype.Controller;


import Controller.Dto.ADto;
import Service.AService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BController {//Bcontroller 생성
    @RequestMapping(value = "/complete")//complete 경로로 가서
                 //request 클래스변수생성, c1.jsp 의 각종 정보들을 불러옴
                 // @ModelAttribute 어노테이션 으로 adto 클래스변수 생성후 ADto 의 정보를 setter 할건데 클래스변수.setWhat 작업 대신 이렇게 작업함.
                // model 클래스변수 생성, addAttribute 메소드선언
    public String main3(HttpServletRequest request, @ModelAttribute ADto adto, Model model) {
        AService aService = new AService(); //aService 클래스 변수 생성
        aService.AADto(adto);// setter 처럼 ad
        model.addAttribute("what",request.getParameter("what"));//웹의 name 값이 what 인것을 찾아 값을 읽어옴>> String 리턴
        return "end";//end.jsp 페이지 열어줌
    }
}