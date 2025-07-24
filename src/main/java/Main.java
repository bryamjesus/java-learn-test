import mokito.Game;

public class Main
{
    public static void main(String[] args)
    {
        simpleTestJunit();
        game();
    }

    private static void simpleTestJunit()
    {
        double salary = -1000;
        System.out.println(MoneyUtil.format(salary, "€"));
        System.out.println("Hello world");
    }

    private static void game()
    {
        Game game = new Game();
        game.play();
    }
}
