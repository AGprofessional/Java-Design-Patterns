package designPatterns;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		// TODO Auto-generated method stub
		if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        }else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
		return null;
	}

}
