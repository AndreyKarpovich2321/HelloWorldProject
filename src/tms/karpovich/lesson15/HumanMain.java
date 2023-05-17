package tms.karpovich.lesson15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Andrew", 10);
        Human father = new Human("Father", 40);
        Human mother = new Human("Mother", 35);
        Human anonym = new Human(null, 50);
        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonym);
        Optional<Human> fatherOpt = Optional.ofNullable(anonym.getFather());
        if (fatherOpt.isPresent()){
            System.out.println(fatherOpt.get().getName());
        }
        fatherOpt.ifPresent(f -> System.out.println(f.getName()));
//        Human possibleFather = fatherOpt.orElseThrow();
//        Human possibleFather = fatherOpt.orElseThrow(() -> new RuntimeException());
        fatherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()), () -> System.out.println("Anonym"));
        Human protector = new Human("Prot", 100);
        Human ourDef = fatherOpt.orElse(protector);
        Optional.ofNullable(human.getFather()).orElse(getDefaultHuman());
        Optional.ofNullable(human.getFather()).orElseGet(() -> getDefaultHuman());
        fatherOpt.map(f -> f.getFather()).map(f -> f.getFather()).ifPresent(ded -> System.out.println(ded.getName()));
        Optional.ofNullable(human).map(Human::getFather).filter(f -> f.getName().startsWith("Ab")).ifPresent(f -> System.out.println(f));

    }
    private static Human getDefaultHuman(){
        System.out.println("Default Human");
        return new Human("Prot", 100);
    }
}
