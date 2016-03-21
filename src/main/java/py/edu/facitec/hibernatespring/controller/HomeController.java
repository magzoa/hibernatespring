package py.edu.facitec.hibernatespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Gestionar las peticiones
@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index(){
		
		System.out.println("Biemvenido a la web");
		//retorna una pagina en la url
		return "hello-world";
	}
	
	
	
}
