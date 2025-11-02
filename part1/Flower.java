package part1;

public class Flower{
    private String species;

    public Flower(String species){
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    @Override
    public String toString(){
        return "Flower{" + species + "}";
    }

}