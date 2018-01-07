package z18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Robot {

        private Map<Details, Object> detailsSet;

    public Robot() {
        this.detailsSet = Arrays.stream(Details.values())
                .collect(Collectors.toMap(Function.identity(),s->s));

        detailsSet.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }








//    public boolean isReady(){
//        if detailsSet.size()==
//        return
//    }





}
