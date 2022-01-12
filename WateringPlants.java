package prasoon.odessa;

public class WateringPlants {
    public static void main(String[] args) {
        int [] plant={7,7,7,7,7,7,7};
        int capacity=8;
        int wr=capacity;
        int steps=0;
        for (int i = 0; i <plant.length ; i++) {
            if(plant[i]<=wr)
            {
                steps+=1;
                wr=wr-plant[i];
            }
            else if(plant[i]>wr)
            {
                steps+=i;
                wr=capacity;
                steps+=i+1;
                wr=wr-plant[i];
            }
        }
        System.out.println(steps);

    }
}
