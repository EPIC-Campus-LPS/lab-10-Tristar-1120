package part2;

public class MountainClimber {
    private Mountain[] wantToClimb;

    public MountainClimber(Mountain[] wantToClimb) {
        this.wantToClimb = wantToClimb;
    }

    public Mountain[] getWantToClimb() {
        return wantToClimb;
    }

    public void setWantToClimb(Mountain[] wantToClimb) {
        this.wantToClimb = wantToClimb;
    }

    public Mountain mostDifficultClimb() {
        if (wantToClimb.length == 0) {
            return null;
        }
        Mountain mostDifficult = wantToClimb[0];
        for (Mountain m : wantToClimb) {
            if (m.getClimbDifficulty() > mostDifficult.getClimbDifficulty()) {
                mostDifficult = m;
            }
        }
        return mostDifficult;
    }

    public void sortClimbLowToHigh() {
        Mountain[] sorted = wantToClimb.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].getClimbDifficulty() > sorted[j + 1].getClimbDifficulty()) {
                    Mountain temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        wantToClimb = sorted;
    }

    public void sortClimbHighToLow() {
        Mountain[] sorted = wantToClimb.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].getClimbDifficulty() < sorted[j + 1].getClimbDifficulty()) {
                    Mountain temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        wantToClimb = sorted;
    }

    public MountainClimber getFourteeners() {
        int count = 0;
        for (Mountain m : wantToClimb) {
            if (m.getElevation() >= 14000) {
                count++;
            }
        }
        Mountain[] fourteeners = new Mountain[count];
        int index = 0;
        for (Mountain m : wantToClimb) {
            if (m.getElevation() >= 14000) {
                fourteeners[index] = m;
                index++;
            }
        }
        return new MountainClimber(fourteeners);
    }

    @Override
    public String toString() {
        String st = "MountainClimber{";
        for (Mountain m : wantToClimb) {
            st += m.toString() + ", ";
        }
        st = st.substring(0, st.length() - 2);
        st += "}";
        return st;
    }
}
