package Prog13_javascript_api_database.repositories;

import Prog13_javascript_api_database.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Integer> {
}
