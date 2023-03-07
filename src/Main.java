import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,User> map = new HashMap<>();
        map.put(1,new User(15,"user1"));
        map.put(2,new User(20,"user2"));
        map.put(5,new User(17,"user5"));
        map.put(4,new User(56,"user4"));
        map.put(3,new User(73,"user3"));
       int countZ = 0;
       int countK = 0;

        for (int i = 1; i <= map.size(); i++) {
            if(i % 2 == 0){
                countZ++;
            }else {
                countK++;
            }
        }

        User[] arrZ = new User[countZ];
        User[] arrK = new User[countK];

        int indexZ = 0;
        int indexK = 0;

        for (Integer i = 1; i <= map.size();i++) {
            if(i % 2 == 0){
                arrZ[indexZ] = map.get(i);
                indexZ++;
            }
        }

        for (Integer i = 1; i <= map.size();i++) {
            if(i % 2 != 0){
                arrK[indexK] = map.get(i);
                indexK++;
            }
        }
        System.out.println(Arrays.toString(arrZ));
        System.out.println(Arrays.toString(arrK));
    }
}