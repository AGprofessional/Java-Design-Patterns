package designPatterns;

public interface AbstractFactory<T> {
	T create(String animalType);

}
