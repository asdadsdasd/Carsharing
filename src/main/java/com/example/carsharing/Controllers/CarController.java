package com.example.carsharing.Controllers;

import com.example.carsharing.models.Car;
import com.example.carsharing.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/")
    public String cars(@RequestParam(name = "brand", required = false) String brand, Model model) {
        model.addAttribute("cars", carService.listCars(brand));
        return "cars";
    }

    @GetMapping("/car/{id}")
    public String carInfo(@PathVariable Long id, Model model){
        model.addAttribute("car", carService.getCarById(id));

        return "car-info";
    }

    @PostMapping("/car/create")
    public String createCar(Car car){
        carService.saveCar(car);
        return "redirect:/";
    }

    @PostMapping("/car/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        carService.deleteCar(id);
        return "redirect:/";
    }
}
