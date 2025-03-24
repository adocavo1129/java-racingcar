packege racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Random;

public class car {
    private String name;
    private String position;

    public car(String name){
        this.name = name;
        int position = 0;
    }
    private int ran() {
        Random rd = new Random();
        return rd.nextInt(10);
    }

    public void move(){
        if(ran() >= 4){position += 1;}
    }
    public String getname(){return name;}

}
