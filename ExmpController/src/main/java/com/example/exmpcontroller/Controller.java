package com.example.exmpcontroller;


import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {

@RequestMapping("/helloWorld")
    public String ProvaPassParameterModel (Model model) {
    Map<String ,String> map = new HashMap<>();
    map.put("spring" , "mvc");
    model.addAttribute("messageOne" , "Hello World From Controller") ;
    model.mergeAttributes(map);
    return "Response/message.html ";
}
//Secondo Metodo Simile differnza BOH
@RequestMapping("/HelloWorldMetd2")
public String passParamWithModelMap(ModelMap map){
    map.addAttribute("welcomeMessage","welcome");
    map.addAttribute("messageTwo","message con Model");
    return "Response/message.html ";
}

//TerzoMetodo
@RequestMapping("/helloWorldMetd3")
public ModelAndView passParamWithModelAndView(){
    ModelAndView modelAndView = new ModelAndView( "Response/message.html ");
    modelAndView.addObject("messageThree" , "messagio Con model and view");
    return  modelAndView;
}





}
