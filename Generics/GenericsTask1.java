package Generics;

//Generic class -> No classCastException + type safety
//Here Box is generic class and T is type parameter.
class GenericsTask1<T> {
    T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
    public static void main(String[] args) {
        GenericsTask1<Integer> i = new GenericsTask1<>();
        i.set(100);
        System.out.println(i.get());
        GenericsTask1<String> s = new GenericsTask1<>();
        s.set("Hello");
        System.out.println(s.get());
        GenericsTask1<Double> b = new GenericsTask1<>();
        b.set(2.5);
        System.out.println(b.get());
    }
}
