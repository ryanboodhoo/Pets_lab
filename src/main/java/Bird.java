public class Bird extends Animals{

    public Bird() {
        super("bird");
    }

    @Override
        public void makeNoise(){
            System.out.println(getName() + " " + "Tweet-Tweet");
        }
    }