import org.w3c.dom.ls.LSOutput;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //    Product[] cart = new Product[10];
    ArrayList<Product> cart = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void MainMenu() {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요." + "\n");

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주" + "\n");

        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        System.out.println("----------------------------------------------");
    }

    public void BurgerMenu() {
        Product[] Burger = new Product[3];
        Burger[0] = new Product("햄버거1", 165423.0, "맛있음1");
        Burger[1] = new Product("햄버거2", 243213.0, "맛있음2");
        Burger[2] = new Product("햄버거3", 314321.0, "맛있음3");

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." + "\n");

        for (int i = 0; i < Burger.length; i++) {
            System.out.println(i + 1 + "." + Burger[i].getName() + "   /   " + Burger[i].getPrice() + "   /   " + Burger[i].getDesc());
        }
        System.out.println("----------------------------------------------");
        int choice = scan.nextInt();

        cart.add(Burger[choice - 1]);
        System.out.println(Burger[choice - 1].getName() + "   /   " + Burger[choice - 1].getPrice() + "   /   " + Burger[choice - 1].getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까");
        System.out.println("1.확인" + "    " + "2.취소");
        int choice2 = scan.nextInt();
        if (choice2 == 1) {
            System.out.println(Burger[choice - 1].getName() + "이(가) 장바구니에 추가되었습니다." + "\n");
            System.out.println("----------------------------------------------");
            Order();
        } else if (choice2 == 2) {
            BurgerMenu();
        }
        return;

    }

    public void CustardMenu() {
        Product[] Custard = new Product[3];
        Custard[0] = new Product("아이스크림1", 11111.0, "맛있음1");
        Custard[1] = new Product("아이스크림2", 22222.0, "맛없음ㅠ");
        Custard[2] = new Product("아이스크림3", 33333.0, "맛있음3");

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." + "\n");

        for (int i = 0; i < Custard.length; i++) {
            System.out.println(i + 1 + "." + Custard[i].getName() + "   /   " + Custard[i].getPrice() + "   /   " + Custard[i].getDesc());
        }
        System.out.println("----------------------------------------------");
        int choice = scan.nextInt();

        cart.add(Custard[choice - 1]);
        System.out.println(Custard[choice - 1].getName() + "   /   " + Custard[choice - 1].getPrice() + "   /   " + Custard[choice - 1].getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까");
        System.out.println("1.확인" + "    " + "2.취소");
        int choice2 = scan.nextInt();
        if (choice2 == 1) {
            System.out.println(Custard[choice - 1].getName() + "이(가) 장바구니에 추가되었습니다." + "\n");
            System.out.println("----------------------------------------------");
            Order();
        } else if (choice2 == 2) {
            CustardMenu();
        }

        return;
    }
    public void DrinkMenu() {
        Product[] Drink = new Product[3];
        Drink[0] = new Product("음료1", 11111.0, "맛있음");
        Drink[1] = new Product("음료2", 22222.0, "맛없음ㅠ");
        Drink[2] = new Product("음료3", 33333.0, "기깔남");

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." + "\n");

        for (int i = 0; i < Drink.length; i++) {
            System.out.println(i + 1 + "." + Drink[i].getName() + "   /   " + Drink[i].getPrice() + "   /   " + Drink[i].getDesc());
        }
        System.out.println("----------------------------------------------");
        int choice = scan.nextInt();

        cart.add(Drink[choice - 1]);
        System.out.println(Drink[choice - 1].getName() + "   /   " + Drink[choice - 1].getPrice() + "   /   " + Drink[choice - 1].getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까");
        System.out.println("1.확인" + "    " + "2.취소");
        int choice2 = scan.nextInt();
        if (choice2 == 1) {
            System.out.println(Drink[choice - 1].getName() + "이(가) 장바구니에 추가되었습니다." + "\n");
            System.out.println("----------------------------------------------");
            Order();
        } else if (choice2 == 2) {
            DrinkMenu();
        }

        return;
    }
    public void BeerMenu() {
        Product[] Beer = new Product[3];
        Beer[0] = new Product("맥주1", 0.0, "무료인데 맛있다고?");
        Beer[1] = new Product("맥주2", 0.0, "맥주는 다 맛있어.");
        Beer[2] = new Product("맥주3", 0.0, "정말이야.");

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." + "\n");

        for (int i = 0; i < Beer.length; i++) {
            System.out.println(i + 1 + "." + Beer[i].getName() + "   /   " + Beer[i].getPrice() + "   /   " + Beer[i].getDesc());
        }
        System.out.println("----------------------------------------------");
        int choice = scan.nextInt();

        cart.add(Beer[choice - 1]);
        System.out.println(Beer[choice - 1].getName() + "   /   " + Beer[choice - 1].getPrice() + "   /   " + Beer[choice - 1].getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까");
        System.out.println("1.확인" + "    " + "2.취소");
        int choice2 = scan.nextInt();
        if (choice2 == 1) {
            System.out.println(Beer[choice - 1].getName() + "이(가) 장바구니에 추가되었습니다." + "\n");
            System.out.println("----------------------------------------------");
            Order();
        } else if (choice2 == 2) {
            BeerMenu();
        }

        return;
    }
    public void OrderMenu(){
        double total = 0;
        System.out.println("[Order]");
        for (int i= 0;i<cart.size();i++){
            System.out.println(cart.get(i).toString());

            total += cart.get(i).getPrice();
        }
        System.out.println("\n" + "[Total]" +"\n"+ total +"원" );
        System.out.println("1. 주문" + "       " + "2. 메뉴판");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("주문이 완료되었습니다!" + "\n");
                System.out.println("대기번호는 [ 1 ]번입니다.");
                System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                break;
            case 2:
                MainMenu();
                break;
        }
    }

    public void CancelMenu(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1.확인" + "   " + "2.취소");
        int choice = scan.nextInt();
        if (choice == 1){
            Order clear = new Order();
            cart.clear();
            System.out.println("\n\n\n" + "진행하던 주문이 취소되었습니다.");
        } else if (choice==2) {
            Order();
        }
    }

    public void Order() {
        while (true) {
            MainMenu();
//            break;
            int menuNumber = scan.nextInt();
//
            switch (menuNumber) {
                case 1:
                    BurgerMenu();
                    break;
                case 2:
                    CustardMenu();
                    break;
                case 3:
                    DrinkMenu();
                    break;
                case 4:
                    BeerMenu();
                    break;
                case 5:
                    OrderMenu();
                    break;
                case 6:
                    CancelMenu();
                    break;
            }
        }
    }
}
