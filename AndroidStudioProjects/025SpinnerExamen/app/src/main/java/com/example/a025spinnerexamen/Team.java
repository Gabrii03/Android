package com.example.a025spinnerexamen;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int photo;
    private String name;
    private String city;
    private String country;
    private String year;

    public Team (int photo, String name, String city, String country, String year){
        this.photo = photo;
        this.name = name;
        this.city = city;
        this.country = country;
        this.year = year;
    }

    public static int [] ESCUDO={
           /* R.drawable.zvezda;
            R.drawable.maccabi;
            R.drawable.zalgiris;
            R.drawable.zvezda;
            R.drawable.zvezda;
            R.drawable.zvezda;*/
};


    public static final String[] NOMBRE={
            "Košarkaški Klub Crvena Zvezda",
        "Maccabi Basketball Club",
        "Basketball Club Žalgiris ",
        "Club Deportivo Baskonia ",
        "PanathinaikosBasketball Club"
        };

    public static final String[] PAIS={
        "Košarkaški Klub Crvena Zvezda",
        "Maccabi Basketball Club",
        "Basketball Club Žalgiris ",
        "Club Deportivo Baskonia ",
        "PanathinaikosBasketball Club"
        };
    public static final String[] CIUDAD={
        "Košarkaški Klub Crvena Zvezda",
        "Maccabi Basketball Club",
        "Basketball Club Žalgiris ",
        "Club Deportivo Baskonia ",
        "PanathinaikosBasketball Club"
        };
    public static final String[] AÑO={
        "Košarkaški Klub Crvena Zvezda",
        "Maccabi Basketball Club",
        "Basketball Club Žalgiris ",
        "Club Deportivo Baskonia ",
        "PanathinaikosBasketball Club"
        };

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int[] getESCUDO() {
        return ESCUDO;
    }

    public static void setESCUDO(int[] ESCUDO) {
        Team.ESCUDO = ESCUDO;
    }

    public static List<Team> crearTeam(){
        List <Team> lista = new ArrayList<>();
        for (int i=0; i<5; i++){
            Team equipo = new Team(ESCUDO[i], String.valueOf(NOMBRE[i]),String.valueOf(CIUDAD[i]), String.valueOf(PAIS[i]), String.valueOf(AÑO[i]));
            lista.add(equipo);
        }
        return lista;
    }
}
