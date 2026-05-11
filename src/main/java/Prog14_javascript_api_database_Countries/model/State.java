package Prog14_javascript_api_database_Countries.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="state")
public class State {

    @Id
    @Column(name = "stateId")
    private Integer stateId;

    @Column(name = "state")
    private String state;

    @Column(name="countryId")
    private Integer countryId;
}


