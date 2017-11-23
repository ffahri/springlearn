package com.webischia.test1.controllers;

import com.webischia.test1.domain.Category;
import com.webischia.test1.domain.UnitOfMeasure;
import com.webischia.test1.repositories.CategoryRepository;
import com.webischia.test1.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class indexController {

    CategoryRepository categoryRepository;
    UnitOfMeasureRepository unitOfMeasureRepository;


    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage()
    {
        //repodan stringdeki descp uyanı getir dedik
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        //gelenin idsini öğrendik
        System.out.println("Category id = " + categoryOptional.get().getId());
        System.out.println("UOM ID = " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
