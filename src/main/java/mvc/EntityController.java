package mvc;

import jpa.BeanEntity;
import jpa.BeanEntityDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller
@RequestMapping("/entities")
public class EntityController {

	private BeanEntityDAO beanEntityDAO;

	@Inject
	public EntityController(BeanEntityDAO beanEntityDAO) {
		this.beanEntityDAO = beanEntityDAO;
	}

	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String showForm(Model model) {
		model.addAttribute(new BeanEntity());
		return "newEntityTile";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addEntityFromForm(@Valid BeanEntity beanEntity, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "newEntityTile";
		}

		beanEntityDAO.addEntity(beanEntity);

		return "redirect:/entities?list";
	}

	@RequestMapping(method = RequestMethod.GET, params = "list")
	public String list(Model model) {
		model.addAttribute(beanEntityDAO.listAll());
		return "listEntitiesTile";
	}
}