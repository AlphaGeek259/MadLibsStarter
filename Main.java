class Main {
  public static void main(String[] args) {
    MadLibMaker maker = new MadLibMaker();

    maker.addToStory("Yesterday, I went to the ");
    maker.askSpeechPart("Noun");
    maker.addToStory(". I had to ");
    maker.askSpeechPart("Verb");

    maker.showStory();
  }
}