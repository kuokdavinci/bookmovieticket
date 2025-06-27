package Services;

import Model.Chair;

import java.util.List;
import java.util.Scanner;

public class SelectChair {
    public Chair selectChair (List<Chair> chairs, Scanner sc){
        System.out.println("Available chair");
        for(int i =0;i<chairs.size();i++)
        {
            System.out.println("Chair "+i+(chairs.get(i).isBooked()?" is booked":" is empty"));
        }
        System.out.println("Select your chair:");
        int chairIndex = sc.nextInt();
        return chairs.get(chairIndex);
    }
}
