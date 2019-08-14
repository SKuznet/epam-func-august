package hw1.Cats;


import hw1.Cat;

public class NoNameCat implements Cat {

    @Override
    public void sayName() {
        System.out.println("I have no name!");
    }

    @Override
    public String name() {
        return "NoNameCat";
    }

    @Override
    public boolean equals(Object obj) {
        if(super.getClass() == obj.getClass()) {
            return true;
        }
        else return false;
    }

}
