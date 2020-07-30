package com.layout.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
		@RequestMapping("/index")
	    public String index(){
	        return "index";
	    }
		
		@RequestMapping("/cards")
	    public String cards(){
	        return "cards";
	    }
		
		@RequestMapping("/texto")
	    public String texto(){
	        return "texto";
	    }
		
		@RequestMapping("/lista")
	    public String lista(){
	        return "lista";
	    }

}
