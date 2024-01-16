package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private static final List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Chevrolet","Black",271));
        carList.add(new Car("Toyota","Purple",12));
        carList.add(new Car("Lada","Blue",4));
        carList.add(new Car("Honda","Yellow",583));
        carList.add(new Car("Mazda","Red",191));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}
