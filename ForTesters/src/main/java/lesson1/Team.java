package lesson1;

public class Team {

    private Animal[] animals = new Animal[4];
    private String teamName;

    Team(String teamName){
        this.teamName = teamName;
    }

    Team(String teamName, Animal animal1, Animal animal2, Animal animal3, Animal animal4){
        this.teamName = teamName;
        this.animals[0] = animal1;
        this.animals[1] = animal2;
        this.animals[2] = animal3;
        this.animals[3] = animal4;
    }

    public void addToTeam(Animal animal){
        for(int i=0; i < this.animals.length; i++){
            if(animals[i] == null){
                animals[i] = animal;
                return;
            }
        }
        System.out.println("Команда заполнена");
    }

    public void showTeam(){
        for(int i=0; i < this.animals.length; i++){
            System.out.println(animals[i]);
        }
    }

}
