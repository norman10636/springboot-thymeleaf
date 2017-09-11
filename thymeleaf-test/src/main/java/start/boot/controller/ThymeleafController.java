package start.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import start.boot.dao.CarDao;

@Controller
public class ThymeleafController {

	@GetMapping("/")
	public String hello(ModelMap model){
		model.put("A", "hey~~");
		model.put("B", 123);
		return "index";
	}
	@GetMapping("/carinfo")
	public String getCar(ModelMap model){
		CarDao carDao = new CarDao();
		model.put("car", carDao.getCar());
		return "carinfo";
	}
	@GetMapping("/carlist")
	public String getCarList(ModelMap model){
		CarDao carDao = new CarDao();
		model.put("carlist", carDao.getCarList());
		return "carlist";
	}
}
