class Oblig8{
  public static void main(String[] args) {
    Main kontroll = new Main();
    kontroll.lesInnFil("Brett1.txt");
    Brett board = kontroll.getBrett();
    board.leggTilBoks();
    board.opprettDatastruktur();
    board.printBrett();
    board.printLosning(0,0);
  }
}
