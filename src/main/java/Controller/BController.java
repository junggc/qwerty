package Controller;

import org.springframework.stereotype.Controller;


import Controller.Dto.ADto;
import Service.AService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BController {
    @RequestMapping(value = "/complete")
    public String main3(HttpServletRequest httpServletRequest, @ModelAttribute ADto adto, Model model) {
        AService aService = new AService();
        aService.AADto(adto);
        model.addAttribute("what",httpServletRequest.getParameter("what"));
        return "end";
    }
}