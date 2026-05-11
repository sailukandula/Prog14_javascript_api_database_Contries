package Prog13_javascript_api_database.service;

import Prog13_javascript_api_database.model.City;
import Prog13_javascript_api_database.model.CountriesStatesCities;
import Prog13_javascript_api_database.model.Country;
import Prog13_javascript_api_database.model.State;
import Prog13_javascript_api_database.repositories.ICityRepository;
import Prog13_javascript_api_database.repositories.ICountryRepository;
import Prog13_javascript_api_database.repositories.IStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService implements IWorldService{

    @Autowired
    ICityRepository cityRepository;

    @Autowired
    ICountryRepository countryRepository;

    @Autowired
    IStateRepository stateRepository;

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void save(State state) {
      stateRepository.save(state);
    }

    @Override
    public void save(City city) {
     cityRepository.save(city);
    }

    @Override
    public List<State> getStates(Integer countryId) {
        return stateRepository.findByCountryId(countryId);
    }

    @Override
    public List<City> getCities(Integer stateId) {
        return cityRepository.findByStateId(stateId);
    }

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }


}
