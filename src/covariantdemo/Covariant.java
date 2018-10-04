package covariantdemo;

class WildAnimal{
    public String areYouBite(){
        return "Yes";
    }
}

class Lion extends WildAnimal{
    public String whoAreYou(){
        return "Lion";
    }
}

class Zoo extends WildAnimal{
    public WildAnimal getWildAnimal(){
        return new WildAnimal();
    }
}

class AfricaZoo extends Zoo{
    @Override
    public Lion getWildAnimal() {   //covariant return type Lion
        return new Lion();
    }
}
public class Covariant {
    public static void main(String[] args){
        AfricaZoo africaZoo = new AfricaZoo();
        System.out.println("Africa Zoo have : "+africaZoo.getWildAnimal().whoAreYou()+" and he bites? : "+africaZoo.getWildAnimal().areYouBite());
    }
}
