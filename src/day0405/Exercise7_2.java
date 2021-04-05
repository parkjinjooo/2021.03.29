package day0405;

class SutDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutDeck() {
        // 초기화를 통해 값들을 지정하고 인스턴스를 만들어 값을 담아준다.
        for (int i = 0; i < cards.length; i++) {
            // num, boolean 을 새롭게 초기화 해줘야 된다.
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            // 이 부분이 진짜 인스턴스의 생성!
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {

    }

    public SutdaCard pick(int index) {
        // 값 검증이 필요
        if (index >= 0 && index < cards.length) {

            return cards[index];

        } else {

            return cards[0];
        }
    }

    public SutdaCard pick() {
        return cards[(int) (Math.random() * 20)];

    }

}

class SutCard {
    int num;
    boolean isKwang;

    SutCard() {
        this(1, true);
    }

    SutCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;

    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}

class Exercise7_2 {
    public static void main(String[] args) {
        SutDeck deck = new SutDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");

            System.out.println();
            System.out.println(deck.pick(0));
        }

    }
}
