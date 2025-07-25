package mokito.example2.persistence.entity.repository;

import error.PlayerNotFoundException;
import mokito.example2.persistence.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayerRepositoryImpl implements IPlayerRepository
{

    private List<Player> playerDatabase = new ArrayList<>(
            List.of(new Player(1L, "Lionel Messi", "Inter Miami", "Delantero"),
                    new Player(2L, "Cristiano Ronaldo", "Al Nassr",
                            "Delantero"),
                    new Player(3L, "Neymar Jr.", "Paris Saint-Germain",
                            "Delantero"),
                    new Player(4L, "Kylian Mbappé", "Paris Saint-Germain",
                            "Delantero"),
                    new Player(5L, "Kevin De Bruyne", "Manchester City",
                            "Volante"),
                    new Player(6L, "Virgil van Dijk", "Liverpool", "Defensa")));

    @Override
    public List<Player> findAll()
    {
        System.out.println("--> Meotod findAll real!");
        return playerDatabase;
    }

    @Override
    public Player findById(Long id)
    {
        System.out.println("--> Meotod findId real!");
        return this.playerDatabase.stream()
                .filter(player -> Objects.equals(player.getId(), id))
                .findFirst().orElseThrow(() -> new PlayerNotFoundException(
                        "Player not found with id: " + id));
    }

    @Override
    public void save(Player player)
    {
        System.out.println("--> Meotod save real!");
        this.playerDatabase.add(player);
    }

    @Override
    public void deletePlayer(Long id)
    {
        this.playerDatabase.removeIf(
                player -> Objects.equals(player.getId(), id));
    }
}
