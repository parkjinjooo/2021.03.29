package day0405;

class SutdaDeck {
    final int CARD_NUM = 20;
    // SutdaCard를 위한 공간만 마련되어 있다.
    // 여기에 인스턴스를 직접 담아야 한다.
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 초기화를 통해 값들을 지정하고 인스턴스를 만들어 값을 담아준다.
        for (int i = 0; i < cards.length; i++) {
            // num, boolean 을 새롭게 초기화 해줘야 된다.
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;

    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

    }
}
