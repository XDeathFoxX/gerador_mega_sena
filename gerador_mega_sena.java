package gerador_mega_sena;

import java.util.Random;

public class gerador_mega_sena {
    
    public static void main(String[] args){
        Random random_number = new Random();

        for(int i = 0; i < 6; i++){
            int number = random_number.nextInt(1,60);
            System.out.println(number);
        }
    }
}
