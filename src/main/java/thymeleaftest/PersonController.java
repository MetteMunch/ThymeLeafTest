package thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//Controller annotationen fortæller Spring at denne klasse er ansvarlig for at håndtere http-anmodninger fra klienter

public class PersonController {

    @GetMapping("/people")//denne annotation fortæller at når URL med /people kaldes i fx browser, så kaldes denne metode
    public String getPeople(Model model){//Spring opretter automatisk et Model objekt og giver med. Model er en form for beholder til data.
        model.addAttribute("something","this is coming from the controller"); //her tilføjes modellen data (key/value).
        //denne data kan senere hentes via Thymeleaf-skabelonen (HTML-filen) og læses via udtrykket ${key}, hvorefter værdi vises
        return "people"; //denne String angiver hvilken
        // HTML fil.navn Spring skal lede efter og scanne
    }


}
