package com.org.gen.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AddController
{
@RequestMapping("add")
public ModelAndView add(@RequestParam("name") String num1, @RequestParam("pass")String num2) {
ModelAndView mv =new ModelAndView();
mv.setViewName("result.jsp");
return mv;

}}
