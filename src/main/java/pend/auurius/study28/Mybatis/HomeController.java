package pend.auurius.study28.Mybatis;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pend.auurius.study28.dao.ContentDao;
import pend.auurius.study28.dto.ContentDto;



@Controller
public class HomeController {
	
	ContentDao dao;	
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {		
		
		ArrayList<ContentDto> dtos = dao.listDao();
		
		model.addAttribute("list", dtos);	// list란 이름으로 모델에 옮긴다.
		
		return "list";
	}
	
	@RequestMapping(value = "/writeForm")
	public String writeForm() {		
		
		return "writeForm";
	}
	
	@RequestMapping(value = "write")
	public String write(HttpServletRequest request) {
		
		String mwriter = request.getParameter("mwriter");
		String mcontent = request.getParameter("mcontent");
		
		dao.writeDao(mwriter, mcontent); // 만들어둔 메소드 불러오기.
		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(HttpServletRequest request) {
		
		
		String mid = request.getParameter("mid");
		
		dao.deleteDao(mid);
		
		return "redirect:list";
	}
}

