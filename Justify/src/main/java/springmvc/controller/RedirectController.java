package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping(value = "/credentials", method = RequestMethod.POST)
	public String myPage(@RequestParam("userName") String name, @RequestParam("password") String password) {
		System.out.println(name);
		System.out.println(password);
		//RedirectView rv = new RedirectView();
		//	rv.setUrl("http://www.google.com");
		//rv.setUrl("enjoy");
		//m.addAttribute("name", name);
		//return "redirect:/enjoy";
		return "redirect:/enjoy";
	}

	@RequestMapping(value = "/enjoy")
	public String ntg() {
		System.out.println("sample");
		return "norm";
	}

	@RequestMapping(value = "/surf", method = RequestMethod.POST)
	public RedirectView showingPage(@RequestParam("here") String text) {
		System.out.println("surfing.....");
		RedirectView rv = new RedirectView();
		String s = "http://www.google.com/search?q=" + text;
		rv.setUrl(s);
		//return "redirect:http://www.google.com/search?q=s";
		return rv;
	}
}
