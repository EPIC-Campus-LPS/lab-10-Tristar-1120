package part2;

public class Mountain {
    private String name;
    private int elevation;
    private double climbDifficulty;

    public Mountain(String name, int elevation, double climbDifficulty) {
        this.name = name;
        this.elevation = elevation;
        this.climbDifficulty = climbDifficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public double getClimbDifficulty() {
        return climbDifficulty;
    }

    public void setClimbDifficulty(double climbDifficulty) {
        this.climbDifficulty = climbDifficulty;
    }

    @Override
    public String toString() {
        return "Mountain{" +name + ", " + elevation + ", " + climbDifficulty + "}";
    }
}
