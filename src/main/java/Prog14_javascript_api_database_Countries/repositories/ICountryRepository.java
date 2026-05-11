package Prog14_javascript_api_database_Countries.repositories;

import Prog14_javascript_api_database_Countries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Integer> {
}
