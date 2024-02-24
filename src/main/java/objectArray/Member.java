package objectArray;

public class Member {

    private int earn;
    private String name;
    public static final int class1 = 50000;
    public static final int class2 = 10000;
    public Member() {}


    public Member(int earn, String name){
        this.earn= earn;
        this.name = name;
    }

    public int getEarn() {
        return earn;
    }

    public void setEarn(int earn) {
        this.earn = earn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Member{" +
                "earn=" + earn +
                ", name='" + name + '\'' +
                '}';
    }
}
