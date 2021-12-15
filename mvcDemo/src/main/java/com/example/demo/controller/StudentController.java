package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
      @Autowired
     EmpService service;
      
      
//	@RequestMapping("/")
//	public ModelAndView dem(ModelAndView mv){
//		mv.setViewName("index.jsp");
//		
//		return mv;
//	}
	
	
//	@RequestMapping("/print")
//	public String demo(HttpServletRequest req)
//	{
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
//		String designation=req.getParameter("desig");
//		System.out.println("Hi WELCOME "+name+"Your designation is"+designation);
//		session.setAttribute("username",name);
//		return "welcome.jsp";
//	}
//	
//	@RequestMapping("/print")
//	public String demo(String name,String desig,HttpSession session)
//	{
//		session.setAttribute("username",name);
//		session.setAttribute("designation",desig);
//		return "welcome.jsp";
//}
//	@RequestMapping("/print")
//	public String demo(@RequestParam("name") String uname,HttpSession session)
//	{
//		session.setAttribute("username",uname);
//		return "welcome.jsp";
//}
//	@RequestMapping("/print")
//	public ModelAndView demo(@RequestParam("name")String name,ModelAndView mv)
//	{
//      mv=new ModelAndView();
//      mv.setViewName("welcome.jsp");
//	 mv.addObject("username",name);
//	 return mv;
//	}
	@RequestMapping("/")
	public ModelAndView demo(ModelAndView mv)
	{
      mv=new ModelAndView();
      mv.setViewName("index");
      List<Employee> list=service.getEmployees();
	  mv.addObject("all",list);
	 return mv;
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView empSave(ModelAndView mv,Employee emp)
	{
     mv.setViewName("redirect:/");
	    service.saveEmp(emp);
	    return mv;
	}
	@RequestMapping(value="/delete/{id}")
	public ModelAndView deleteEmp(@PathVariable("id") int id,ModelAndView mv) {
		mv.setViewName("redirect:/");
		service.deleteEmp(id);
		return mv;
		
	}
	@RequestMapping(value="/edit")
	public ModelAndView updateEmp(@RequestParam("id") int id,ModelAndView mv) {
		mv=new ModelAndView("update");
		mv.addObject("id",id);
		return mv;
		
	}
}