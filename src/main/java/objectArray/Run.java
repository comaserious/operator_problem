package objectArray;

public class Run {

    public static void main(String[] args) {

    Member[] members = new Member[13];

    members[0] = new Member(100000,"기소연");
    members[1] = new Member(50000,"감자희");
    members[2] = new Member(120000,"유자겸");
    members[3] = new Member(1000000,"홍길동");
    members[4] = new Member(450000,"고길동");
    members[5] = new Member(270000,"허윤회");
    members[6] = new Member(30000,"이주헌");
    members[7] = new Member(5000,"김진규");
    members[8] = new Member(1200000,"홍명보");
    members[9] = new Member(650000,"이임생");
    members[10] = new Member(135000,"이천수");
    members[11] = new Member(300000,"박항서");
    members[12] = new Member(125000,"조원희");

    int countClass1 = 0;
    int countClass2 = 0;
    for(Member i : members){
        if(i.getEarn()>=900000){
            ++countClass1;
        }
        else if (i.getEarn()>=300000){
            ++countClass2;
        }
    }

        System.out.println("class1 의 고객의 수 : "+countClass1+ " , class1 고객에게 지급예상되는 상품권 총 금액 : "+ countClass1*Member.class1);
        System.out.println("class2 의 고객의 수 : "+countClass2+ " , class1 고객에게 지급예상되는 상품권 총 금액 : "+ countClass2*Member.class2);


    }


}
