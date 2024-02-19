package aplicacionWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aplicacionWeb.model.entity.EntityUsuarios;
import aplicacionWeb.service.ItfUsuariosService;

@Controller
 @RequestMapping("/usuarios")
public class UsuariosController {


	@Autowired
	@Qualifier("implUsuarioServicios")
	private ItfUsuariosService inItfUsuariosService;





	@GetMapping("/form")
	public String UsersForm(Model modelo) {
		modelo.addAttribute("MaaUsuarios", new EntityUsuarios());
		return "usersForm.html";
	}





	@PostMapping("/add")
	public String addUsuarios(@ModelAttribute(name = "usuarios") EntityUsuarios usuarios) {

		this.inItfUsuariosService.AddUsuarios(usuarios);
		return "redirect:/usuarios/list";

	}


	@GetMapping("/list")
	public ModelAndView ListadoUsers() {

		ModelAndView mav = new ModelAndView("users.html");

		mav.addObject("mavAddObject", this.inItfUsuariosService.ListAllUsuarios());

		return mav;

	}

}














