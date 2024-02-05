public class Make_problem {

    public static void main(String[] args) {

        /*class1 과 class2 등급의 고객의 수를 구하고 각 클래스별 소비되는 쿠폰 금액을 구해라*/

        /*김소연 100,000
        * 감자희 50,000
        * 유자겸 120,000
        * 홍길동 1,000,000
        * 고길동 450,000
        * 허윤회 270,000
        * 이주헌 30,000
        * 김진규 5,000
        * 홍명보 1,200,000
        * 이임생 650,000
        * 이천수 135,000
        * 박항서 300,000
        * 조원희 125,000*/

        /*class1 900,000 이상 쓴 고객
        * class2 300,000 이상 쓴 고객
        * */

        /*설날 할인 기념으로 class1 50,000원 상품권 class2 10,000원 상품권을 보낼 예정이다*/


        int 김소연=100000;
        int 감자희= 50000;
        int 유자겸 = 120000;
        int 홍길동 = 1000000;
        int 고길동 = 450000;
        int 허윤회 = 270000;
        int 이주헌 = 30000;
        int 김진규 = 5000;
        int 홍명보 = 1200000;
        int 이임생 = 650000;
        int 이천수 = 135000;
        int 박항서 = 300000;
        int 조원희 = 125000;

        int class1 = 900000;
        int class2 = 300000;

        int point1 = 50000;
        int point2 = 10000;

        System.out.println("========================================================Class1==============");


        int class1Custom=(((김소연 >= class1 )?1:0)+((감자희 >= class1 )?1:0)+((유자겸 >= class1 )?1:0)+
                ((홍길동 >= class1 )?1:0)+((고길동 >= class1 )?1:0)+((허윤회 >= class1 )?1:0)+
                ((이주헌 >= class1 )?1:0)+((김진규 >= class1 )?1:0)+((홍명보 >= class1 )?1:0+((이임생 >= class1 )?1:0)+
                ((이천수 >= class1 )?1:0)+((박항서 >= class1 )?1:0)+((조원희 >= class1 )?1:0)));

        System.out.println("class1 고객의 수 = " + class1Custom);
        System.out.println("class1 cupon 금액 ="+class1Custom*point1);


        System.out.println("===================================================Class2======================");

      int class2Custom=(((김소연<class1 && 김소연>=class2)? 1:0)+((감자희<class1&&감자희>=class2)?1:0)+
              ((유자겸<class1&&유자겸>=class2)?1:0)+((홍길동<class1&&홍길동>=class2)?1:0)
              +((고길동<class1&&고길동>=class2)?1:0)+((허윤회<class1&&허윤회>=class2)?1:0)+
              ((이주헌<class1&&이주헌>=class2)?1:0)+((김진규<class1&&김진규>=class2)?1:0)+
              ((홍명보<class1&&홍명보>=class2)?1:0)+((이임생<class1&&이임생>=class2)?1:0)+
              ((이천수<class1&&이천수>=class2)?1:0)+((박항서<class1&&박항서>=class2)?1:0)+((조원희<class1&&조원희>=class2)?1:0));


        System.out.println("class2 고객의 수 = " + class2Custom);
        System.out.println("class2 cupon 금액 =" + class2Custom*point2);









    }

}
