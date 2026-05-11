package Prog14_javascript_api_database_Countries.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "countryId")
    private int countryId;

    @Column(name = "country")
    private String country;
}