package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class WinnerSelector {
    private final List<Car> winners;

    public WinnerSelector(){
        this.winners = new ArrayList<>();
    }

    public List<Car> selectWinners(List<Car> carList){
        Long maxDistance = Long.MIN_VALUE;

        for(Car car: carList){
            maxDistance = selectWinner(car, maxDistance);
        }

        return winners;
    }

    public Long selectWinner(Car car, Long maxDistance){
        if(car.getDistance() > maxDistance){
            winners.clear();
            winners.add(car);
        }
        else if(car.getDistance() == maxDistance){
            winners.add(car);
        }

        return Math.max(car.getDistance(), maxDistance);
    }
}
