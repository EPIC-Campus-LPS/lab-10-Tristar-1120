package part1;

public class FlowerBed {
    private Flower[] bed;

    public FlowerBed(Flower[] bed){
        this.bed = bed;
    }
    
    public FlowerBed(int size) {
        bed = new Flower[size];
    }

    public Flower[] getBed() {
        return bed;
    }

    public void setBed(Flower[] bed) {
        this.bed = bed;
    }

    public int plantFlower(Flower flower) {
        for(int i = 0; i < bed.length; i++){
            if(bed[i] == null){
                if ((i == 0) && (bed.length >= 1) && bed[i + 1] == null) {
                  bed[i] = flower;
                  return i;
                }
                else if ((i == bed.length - 1) && bed[i -1] == null) {
                  bed[i] = flower;
                  return i;
                }
                else if (i > 0 && i < bed.length - 1 && bed[i - 1] == null && bed[i + 1] == null) {
                  bed[i] = flower;
                  return i;
                }
            }
        
        }
        return -1;
    }

    public void flipBed() {
        for(int i = 0; i < bed.length / 2; i++) {
            Flower temp = bed[i];
            bed[i] = bed[bed.length - 1 - i];
            bed[bed.length - 1 - i] = temp;
        }
    }

    @Override
    public String toString() {
        String st = "FlowerBed{";
        for (Flower i : bed) {
            if (i == null) {
                st += "null";
            } else {
              st += i.toString();
            }
                st += ", ";
            }
        st += "}";
        return st;
    }
}

