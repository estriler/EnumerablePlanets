package org.launchcode.data;

public enum Planets {
    MERCURY ("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth",365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn",10759),
    URANUS("Uranus",30687),
    NEPTUNE("Neptune",60200),
    PLUTO("Pluto",90520);

    private final String name;
    private final Integer yearLength;

    Planets(String name, Integer yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public Integer getYearLength() {
        return yearLength;
    }
}






