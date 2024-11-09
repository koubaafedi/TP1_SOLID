package exercise_refactored;

import java.util.List;

public class CarManager {
    private final CarDatabase _carDatabase;
    private final CarFormatter _carFormatter;
    private final CarComparator _carComparator;

    public CarManager() {
        _carDatabase = new CarDatabase();
        _carFormatter = new CarFormatter();
        _carComparator = new CarComparator();
    }

    public Car getCarById(String carId) {
        return _carDatabase.getFromDb(carId);
    }

    public String getAllCarNames() {
        List<Car> cars = _carDatabase.getAllCars();
        return _carFormatter.getCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = _carDatabase.getAllCars();
        return _carComparator.getBestCar(cars);
    }
}
