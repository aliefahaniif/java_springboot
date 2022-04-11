package section9;
import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        dragonOfLooWater(new ArrayList<>(List.of(5, 4)), new ArrayList<>(List.of(7, 8, 4)));
    }

    public static void dragonOfLooWater(List<Integer> dragonHead, List<Integer> knightHeight) {
        Collections.sort(dragonHead);
        Collections.sort(knightHeight);

        int total_head = 0;
        int index = 0;
        int len_knight = knightHeight.toArray().length;
        int total_height_knight = 0;

        for (var head : dragonHead) {
            total_head += head;
            while(index < len_knight) {
                if(knightHeight.get(index) >= head) {
                    total_height_knight += knightHeight.get(index);
                    index++;
                    break;
                } else {
                    index++;
                }
            }
        }

        if(total_height_knight >= total_head) {
            System.out.println(total_height_knight);
        } else {
            System.out.println("knight fall");
        }
    }

    
}
