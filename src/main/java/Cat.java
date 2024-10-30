public class Cat extends Animals {

    public Cat() {
        super("bird");
    }

    @Override
        public void makeNoise(){
            System.out.println(getName() + " " +"Meow - Meow");
        }
    }
