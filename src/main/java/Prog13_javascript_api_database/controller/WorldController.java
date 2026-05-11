package Prog13_javascript_api_database.controller;

import Prog13_javascript_api_database.model.City;
import Prog13_javascript_api_database.model.Country;
import Prog13_javascript_api_database.model.State;
import Prog13_javascript_api_database.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/world")
public class WorldController {

    @Autowired
    WorldService worldService;

    @PostMapping("/createCountry")
    public ResponseEntity<Country> createCountry(@RequestBody Country country){
        worldService.save(country);
        return ResponseEntity.ok(country);
    }

    @PostMapping("/createState")
    public ResponseEntity<State> createState(@RequestBody State state){
        worldService.save(state);
        return ResponseEntity.ok(state);
    }

    @PostMapping("/createCity")
    public ResponseEntity<City> createCity(@RequestBody City city){
        worldService.save(city);
        return ResponseEntity.ok(city);
    }

    @GetMapping("/stateList")
    public ResponseEntity<List<State>> getStates(Integer countryId){

        return ResponseEntity.ok(worldService.getStates(countryId));
    }
    @GetMapping("/countryList")
    public ResponseEntity<List<Country>> getCountries(){
        return ResponseEntity.ok(worldService.getCountries());
    }
    @GetMapping("/cityList")
    public ResponseEntity<List<City>> getCities(Integer stateId){
        return ResponseEntity.ok(worldService.getCities(stateId));
    }
}
