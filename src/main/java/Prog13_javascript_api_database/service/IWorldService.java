package Prog13_javascript_api_database.service;

import Prog13_javascript_api_database.model.City;
import Prog13_javascript_api_database.model.CountriesStatesCities;
import Prog13_javascript_api_database.model.Country;
import Prog13_javascript_api_database.model.State;

import java.util.List;

public interface IWorldService {
    void save(Country country);
    void save(State state);
    void save(City city);
    List<State> getStates(Integer countryId);
    List<City> getCities(Integer stateId);
    List<Country> getCountries();

}
