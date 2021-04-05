package day0405;

class SutDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutDeck() {
        // �ʱ�ȭ�� ���� ������ �����ϰ� �ν��Ͻ��� ����� ���� ����ش�.
        for (int i = 0; i < cards.length; i++) {
            // num, boolean �� ���Ӱ� �ʱ�ȭ ����� �ȴ�.
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            // �� �κ��� ��¥ �ν��Ͻ��� ����!
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {

    }

    public SutdaCard pick(int index) {
        // �� ������ �ʿ�
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
