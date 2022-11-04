package pend.auurius.study28.Mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pend.auurius.study28.dao.ContentDao;



@Controller
public class HomeController {
	
	ContentDao dao;	
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		
		return "list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {		
		
//		ArrayList<ContentDto> dtos = dao.list();
//		
//		model.addAttribute("list", dtos);
		
		return "list";
	}
	
	@RequestMapping(value = "/writeForm")
	public String writeForm() {		
		
		return "writeForm";
	}
	
	@RequestMapping(value = "write")
	public String write() {
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete() {
		return "redirect:list";
	}
}

