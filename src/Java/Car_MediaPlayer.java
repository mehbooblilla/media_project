package Java;

import java.util.Scanner;

public class Car_MediaPlayer {
    public void onMedia(){
        System.out.println("for Cd enter 1 and for USB enter 2:");
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        if(value==1){
            CD_Player cd_player=new CD_Player();

        }
        else if (value==2){
            USB_Player usb_player=new USB_Player();

        }

}
public void offMedia(){

}




}
