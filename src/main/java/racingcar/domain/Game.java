package racingcar.domain;

import java.util.*;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Game {

    public void play(){
        List<String> cars = parseCarNames(readLine());
    }

    public List<String> parseCarNames(String carNames){
        String regex = ",";
        return Arrays.asList(carNames.split(regex));
    }

}
