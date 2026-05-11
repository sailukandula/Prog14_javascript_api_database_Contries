package Prog13_javascript_api_database.repositories;

import Prog13_javascript_api_database.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStateRepository extends JpaRepository<State, String> {
    List<State> findByCountryId(Integer countryId);
}
