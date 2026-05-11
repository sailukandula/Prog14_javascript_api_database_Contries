package Prog14_javascript_api_database_Countries.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "cityId")
    private int cityId;

    @Column(name = "city")
    private String city;

    @Column(name="stateId")
    private Integer stateId;
}
