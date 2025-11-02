package part2;

public class MountainRunner {
    public static void main(String[] args){
	
	
	Mountain[] wishlist = {new Mountain("Mount Elbert", 14440, 3.2), new Mountain("Maroon Peak", 14163, 9.1), new Mountain("Longs Peak", 14259, 8.3), new Mountain("Ormes Peak", 9727, 1.2)};
	MountainClimber climber = new MountainClimber(wishlist);
	
	System.out.println(climber.mostDifficultClimb()); // Mountain{Maroon Peak, 14163, 9.1}
	
	climber.sortClimbLowToHigh();
	System.out.println(climber.getWantToClimb()[0]); // Mountain{Ormes Peak, 9727, 1.2}
	
	climber.sortClimbHighToLow();
	System.out.println(climber.getWantToClimb()[0]); // Mountain{Maroon Peak, 14163, 9.1}
	
	MountainClimber fourteeners = climber.getFourteeners();
	System.out.println(fourteeners); // MountainClimber{Mountain{Maroon Peak, 14163, 9.1}, Mountain{Longs Peak, 14259, 8.3}, Mountain{Mount Elber, 14440, 3.2}}

    }
}
