package part1;
import java.io.IOException;
  
public class FlowerRunner {  
    public static void main(String[] args) throws IOException {  
          
        System.out.println("Example 0");  
        Flower f = new Flower("Sunflower");  
        System.out.println(f); // Flower{Sunflower}  
  
        System.out.println("\nExample 1");  
  
        Flower[] fArr = {new Flower("Daisy"), null, new Flower("Sunflower"), null, null};  
        FlowerBed flowerBed = new FlowerBed(fArr);  
        System.out.println(flowerBed); // FlowerBed{Flower{Daisy}, null, Flower{Sunflower}, null, null}  
        Flower flower = new Flower("Sunflower");  
        System.out.println(flowerBed.plantFlower(flower)); // 4  
        System.out.println(flowerBed); // FlowerBed{Flower{Daisy}, null, Flower{Sunflower}, null, Flower{Sunflower}}  
  
  
        System.out.println("\nExample 2");  
  
        FlowerBed flowerBed2 = new FlowerBed(3);  
        System.out.println(flowerBed2); // FlowerBed{null, null, null}  
        Flower flower2  = new Flower("Rose");  
        System.out.println(flowerBed2.plantFlower(flower2)); //0  
        System.out.println(flowerBed2); // FlowerBed{Flower{Rose}, null, null}  
  
  
        System.out.println("\nExample 3");  
  
        Flower[] fArr3 = {new Flower("Daisy"), null, null, null};  
        FlowerBed flowerBed3 = new FlowerBed(fArr3);  
        System.out.println(flowerBed3); // FlowerBed{Flower{Daisy}, null, null, null}  
        Flower flower3  = new Flower("Rose");  
        System.out.println(flowerBed3.plantFlower(flower3)); //0  
        System.out.println(flowerBed3); // FlowerBed{Flower{Daisy}, null, Flower{Rose}, null}  
  
  
        System.out.println("\nExample 4");  
  
        Flower[] fArr4 = {new Flower("Daisy"), null, new Flower("Daisy"), null};  
        FlowerBed flowerBed4 = new FlowerBed(fArr4);  
        System.out.println(flowerBed4); // FlowerBed{Flower{Daisy}, null, Flower{Daisy}, null}  
        flowerBed4.flipBed();  
        System.out.println(flowerBed4); // FlowerBed{null, Flower{Daisy}, null, Flower{Daisy}}  
  
    }  
}
