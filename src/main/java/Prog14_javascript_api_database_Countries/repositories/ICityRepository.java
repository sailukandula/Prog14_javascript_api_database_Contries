package Prog14_javascript_api_database_Countries.repositories;

import Prog14_javascript_api_database_Countries.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICityRepository extends JpaRepository<City, Integer> {
    List<City> findByStateId(Integer stateId);
}