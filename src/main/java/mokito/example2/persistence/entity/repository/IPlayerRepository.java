package mokito.example2.persistence.entity.repository;

import mokito.example2.persistence.Player;

import java.util.List;

public interface IPlayerRepository
{
    List<Player> findAll();

    Player findById(Long id);

    void save(Player player);

    void deletePlayer(Long id);
}
