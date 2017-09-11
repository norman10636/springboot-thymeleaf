package start.boot.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import start.boot.entity.Car;

public class CarDao {

	public Car getCar(){
		Car car = new Car("bmw1","1.jpg",new Date());
		return car;
	}
	
	public List<Car> getCarList(){
		List<Car> list = new ArrayList<Car>();
		list.add(new Car("bmw1","1.jpg",new Date()));
		list.add(new Car("bmw2","2.jpg",new Date()));
		list.add(new Car("bmw3","3.jpg",new Date()));
		return list;
	}
}
