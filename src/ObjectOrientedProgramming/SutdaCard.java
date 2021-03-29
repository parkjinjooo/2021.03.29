package ObjectOrientedProgramming;

class ExerCise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        // 내가 만든 초기화
        // num = 1;
        // isKwang = true;

        this(1, true); // SutdaCard(1,true)를 호출
                       // 즉, 파라미터가 있는 생성자를 호출

    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() { // 숫자를 문자열로 반환한다. 광인 경우 K를 덧붙인다.
        return num + (isKwang ? "K" : "");

    }

}
