package ArrayHoldingManyObjects_60;

class ArrayHoldingManyObjects_60 {
    public  static void main(String[] args){
        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);
    }
}