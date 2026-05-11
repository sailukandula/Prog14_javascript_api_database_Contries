package Prog14_javascript_api_database_Countries.service;

import Prog14_javascript_api_database_Countries.model.City;
import Prog14_javascript_api_database_Countries.model.Country;
import Prog14_javascript_api_database_Countries.model.State;

import java.util.List;

public interface IWorldService {
    void save(Country country);
    void save(State state);
    void save(City city);
    List<State> getStates(Integer countryId);
    List<City> getCities(Integer stateId);
    List<Country> getCountries();

}
