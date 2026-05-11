package Prog14_javascript_api_database_Countries.repositories;

import Prog14_javascript_api_database_Countries.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStateRepository extends JpaRepository<State, String> {
    List<State> findByCountryId(Integer countryId);
}
