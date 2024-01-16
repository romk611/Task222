package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloCars {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCarsShow(@RequestParam(value = "count", required = false)Integer count, Model model){
        List<Car> carList = carService.getCars();

        if(count == null || count>carList.size()){
            model.addAttribute("cars",carService.getCars());
            return "cars";
        }
        List<Car> newCarList = new ArrayList<>();
        for(int i = 0; i< count;i++){
            newCarList.add(carList.get(i));
        }
        model.addAttribute("cars",newCarList);
        return "cars";
    }

}
