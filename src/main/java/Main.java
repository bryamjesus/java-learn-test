import mokito.example1.Game;
import mokito.example2.persistence.Player;
import mokito.example2.persistence.entity.repository.PlayerRepositoryImpl;
import mokito.example2.service.PlayerServiceImpl;

public class Main
{
    public static void main(String[] args)
    {
        //simpleTestJunit();
        //mockExampleOneGame();
        mockExampleTwoPlayer();
    }

    private static void simpleTestJunit()
    {
        double salary = -1000;
        System.out.println(MoneyUtil.format(salary, "€"));
        System.out.println("Hello world");
    }

    private static void mockExampleOneGame()
    {
        Game game = new Game();
        game.play();
    }

    private static void mockExampleTwoPlayer()
    {
        PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
        PlayerServiceImpl playerService = new PlayerServiceImpl(
                playerRepository);
        System.out.println(playerService.findAll());
        System.out.println(playerService.findById(2L));
        playerService.deletePlayer(1L);
        System.out.println(playerService.findAll());

        Player player = new Player(7L, "Luiz Diaz", "Delantero", "Liverpool");
        playerService.save(player);
        System.out.println(playerService.findAll());

    }
}
