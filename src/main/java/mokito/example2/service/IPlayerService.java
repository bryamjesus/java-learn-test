package mokito.example2.service;

import mokito.example2.persistence.Player;

import java.util.List;

public interface IPlayerService
{
    List<Player> findAll();

    Player findById(Long id);

    void save(Player player);

    void deletePlayer(Long id);
}
