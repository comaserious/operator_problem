package customerPratice;

public class Membership {

    private String name;
    private int cost;

    private String tear;

    public void setName(String name) {

        this.name =name;
    }
    public String getName () {

        return name;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String whatClass( ){
        if (cost>=900000){
            tear = "class1";
            return "class1";
        }
        else if (cost>=300000){
            tear = "class2";
            return "class2";
        }
        else {
            return "";
        }
    }

    public int getTear () {

        if (cost>=900000){
            System.out.println(name+"님의 등급은 class1 입니다");
            return 50000;
        }
        else if (cost>=300000){
            System.out.println(name+"님의 등급은 class2 입니다");
            return 10000;
        }

            return 0;


    }
}
