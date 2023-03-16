package com.example.edpr62022.controllers;

import com.example.edpr62022.models.*;
import com.example.edpr62022.repo.*;
import com.example.edpr62022.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
    @Autowired
    private AnimeRepository animeRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private LicenseRepository licenseRepository;
    @Autowired
    private HunterRepository hunterRepository;

    @Autowired
    public TypeRepository typeRepository;

    @Autowired
    public MovieRepository movieRepository;

    @GetMapping("/")
    private String Main(Model model){
        return "Home";
    }

    @GetMapping("/mkm")
    private String MKM(Model model){
        Iterable<Anime> anime = animeRepository.findAll();
        model.addAttribute("anime", anime);
        Iterable<Category> category = categoryRepository.findAll();
        model.addAttribute("category", category);
        return "mkm";
    }

    @PostMapping("/mkm/add")
    public String MKMAdd(@RequestParam String anime, @RequestParam String category, Model model)
    {
        Anime anime2 = animeRepository.findByName(anime);
        Category category2 = categoryRepository.findByName(category);
        anime2. getCategories().add(category2);
        category2.getAnime().add(anime2);
        animeRepository.save(anime2);
        categoryRepository.save(category2);
        return "/mkm";
    }

    @GetMapping("/oko")
    public String OKO(Model model){
        Iterable<License> license = licenseRepository.findAll();
        model.addAttribute("license", license);
        return "oko";
    }

    @PostMapping("/oko/add")
    public String OKOAdd(@RequestParam String name, @RequestParam String number, Model model)
    {
        System.out.println(name);
        License license = licenseRepository.findByLicense(number);
        System.out.println(license.getId());
        Hunter person = new Hunter(name, license);
        hunterRepository.save(person);
        return "oko";
    }

    @GetMapping("/mko")
    public String MKO(Model model){
        Iterable<Type> type = typeRepository.findAll();
        model.addAttribute("type",type);
        return "mko";
    }

    @PostMapping("/mko/add")
    public String MKOAdd(@RequestParam String name, @RequestParam String street, Model model)
    {
        Type type1 = typeRepository.findByStreet(street);
        Movie movie = new Movie(name, type1);
        movieRepository.save(movie);
        return "mko";
    }
}
