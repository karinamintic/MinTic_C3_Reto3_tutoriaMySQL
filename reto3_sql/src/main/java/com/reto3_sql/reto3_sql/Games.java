package com.reto3_sql.reto3_sql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "games")
public class Games {
    @Id
    @GeneratedValue
    private Integer idGames;
    private String developer;
    private Integer year;
    private String name;
    private String description;

    ////Hacer los gets y Sets de todos 
    ///idGames
    public Integer getIdGames()
    {
        return idGames;
    }
    public void setIdGames(Integer idGames)
    {
        this.idGames = idGames;
    }
    ///developer
    public String getDeveloper()
    {
        return developer;
    }
    public void setDeveloper(String developer)
    {
        this.developer = developer;
    }
    ///year
    public Integer getYear()
    {
        return year;
    }
    public void setYear (Integer year)
    {
        this.year = year;
    }
    ///name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    //description
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    
}
