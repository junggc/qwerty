package Service;

import Controller.Dto.ADto;
//비즈니스 로직 if, for 여기에서 처리
public class AService {
public String AADto(ADto ao){ //AADto 메소드에 ao클래스변수 생성하여 받음

    try {
       // ao.setAa(ao.getAa());
        if (Integer.parseInt(ao.getAa())!=33){
            ao.setAa(String.valueOf(0));
        }else if(Integer.parseInt(ao.getAa())==33){
            ao.setAa(String.valueOf(330));
        }
    }catch (Exception e){
        System.out.println("오류입니다");
        //ao.setAa(String.valueOf());
    }

    System.out.println(ao.getAa()+" Aa");
    System.out.println(ao.getWhat()+"1 What");
    System.out.println(ao.getTime()+"2 Time");

return null;
}
//    33
  //  330

}
